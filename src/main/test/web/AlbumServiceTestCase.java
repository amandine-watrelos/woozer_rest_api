package web;

import entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.AlbumService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumServiceTestCase {

    @Autowired
    private AlbumService albumService;

    @Test
    public void shouldFindAllByUserId() {
        // when
        List<Album> albumsFound = albumService.findAllByUser(1L);

        // then
        assert (albumsFound.size() == 2);
    }

    @Test
    public void shouldFindAllInGroup() {
        // when
        List<Album> albumsFound = albumService.findAllInGroup(4L);

        // then
        assert (albumsFound.size() == 2);
    }

}