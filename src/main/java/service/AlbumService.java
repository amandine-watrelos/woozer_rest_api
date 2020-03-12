package service;

import entity.Album;

import java.util.List;

public interface AlbumService {

    List<Album> findAllInGroup(Long groupId);

    List<Album> findAllByUser(Long userId);

}
