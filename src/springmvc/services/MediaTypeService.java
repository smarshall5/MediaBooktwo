package springmvc.services;

import hibernate.entity.mediatype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.dao.IMediaTypeDao;

import java.util.List;

@Service
public class MediaTypeService implements IMediaTypeService {

    @Autowired
    private IMediaTypeDao mediaTypeDao;

    @Override
    public List<mediatype> getmediaType() {
        return mediaTypeDao.Getmediatype();
    }

    @Override
    public mediatype getmediaType(int id) {
        return mediaTypeDao.GetMediatype(id);
    }
}
