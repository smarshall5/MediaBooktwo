package springmvc.dao;

import hibernate.entity.mediatype;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MediaTypeDao implements IMediaTypeDao {
    @Autowired
    private SessionFactory factory;

    @Transactional
    @Override
    public List<mediatype> Getmediatype() {
        Session session = factory.getCurrentSession();
        List<mediatype> list = session.createQuery("from mediatype ").getResultList();
        return list;
    }

    @Transactional
    @Override
    public mediatype GetMediatype(int id) {
        Session session = factory.getCurrentSession();
        mediatype aMediaType = session.get(mediatype.class, id);
        return aMediaType;
    }
}
