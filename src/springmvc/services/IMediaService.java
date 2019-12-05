package springmvc.services;

import hibernate.entity.media;

import java.util.List;

public interface IMediaService {

    List<media> GetMedia();

    media GetMedia(int id);

    void SaveMedia(media m);

    void deleteMedia(int Id);

    List<media> getMediaByName(String theSearchTerm);
}
