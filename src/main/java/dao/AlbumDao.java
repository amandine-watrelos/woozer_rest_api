package dao;

import entity.Album;
import entity.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumDao extends CrudRepository<Album, Long> {

    List<Album> findAllByGroupIn(List<Group> group);
}
