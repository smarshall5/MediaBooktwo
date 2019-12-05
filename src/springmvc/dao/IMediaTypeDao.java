package springmvc.dao;

import hibernate.entity.mediatype;

import java.util.List;

public interface IMediaTypeDao {
    List<mediatype> Getmediatype();
    mediatype GetMediatype(int id);
}
