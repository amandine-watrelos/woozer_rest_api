package web;

import entity.Group;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.GroupService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupServiceTestCase {

    @Autowired
    private GroupService groupService;


    @Test
    public void shouldReturnGroupById() {
        // when
        Group groupFound = groupService.findById(1L);

        // then
        assert (groupFound.getName()).equals("Amis collège");
    }

    @Test
    public void shouldUpdateGroup() {
        // given
        Group groupToUpdate = groupService.findById(1L);
        groupToUpdate.setName("Amis collège");

        // when
        Group groupSaved = groupService.save(groupToUpdate);

        // then
        assert (groupSaved.getName()).equals("Amis collège");
    }

    @Test
    public void shouldSaveGroup() {
        // given
        Group groupToSaved = new Group();
        groupToSaved.setName("my group");

        // when
        Group groupSaved = groupService.save(groupToSaved);

        // then
        assert (groupSaved.getName()).equals("my group");
    }

    @Test
    public void shouldFindAllGroupsByUserId() {
        // when
        List<Group> groupsFound = groupService.findAllByUser(1L);

        // then
        assert (groupsFound.size() == 4);
    }

}