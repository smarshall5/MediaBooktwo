package springmvc.services;

import hibernate.entity.mediatype;

import java.util.List;

public interface IMediaTypeService {
    List<mediatype> getmediaType();

    mediatype  getmediaType(int id);
}
