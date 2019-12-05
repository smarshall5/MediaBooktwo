package springmvc.services;

import hibernate.entity.media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.dao.IMediaDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MediaService implements IMediaService {

    @Autowired
    private IMediaDao mediaDao;

    @Override
    @Transactional
    public List<media> GetMedia() {
        return mediaDao.GetMedia();
    }

    @Override
    @Transactional
    public media GetMedia(int id) {
        return mediaDao.GetMedia(id);
    }

    @Override
    @Transactional
    public void SaveMedia(media m) {

        mediaDao.SaveMedia(m);
    }

    @Override
    @Transactional
    public void deleteMedia(int Id) {
        mediaDao.deleteMedia(Id);

    }

    @Override
    @Transactional
    public List<media> getMediaByName(String theSearchTerm) {
        return mediaDao.getMediaByName(theSearchTerm);
    }
}
