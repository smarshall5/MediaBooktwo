package springmvc.dao;

import hibernate.entity.media;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class MediaDao implements IMediaDao {

    @Autowired
    private SessionFactory factory;

    @Transactional
    @Override
    public List<media> GetMedia() {
        Session session = factory.getCurrentSession();
        List<media> list = session.createQuery("from media").getResultList();
        return list;
    }

    @Transactional
    @Override
    public media GetMedia(int id) {
        Session session = factory.getCurrentSession();
        media aMedia = session.get(media.class, id);
        return aMedia;
    }

    @Transactional
    @Override
    public void SaveMedia(media m) {
        Session session = factory.getCurrentSession();
        session.saveOrUpdate(m);
    }

    @Transactional
    @Override
    public void deleteMedia(int Id) {
        Session session = factory.getCurrentSession();
        Query query = session.createQuery("delete from media where id = :deadMedia");
        query.setParameter("deadMedia", Id);
        query.executeUpdate();
    }

    @Override
    public List<media> getMediaByName(String theSearchTerm) {
        Session session = factory.getCurrentSession();

        Query<media> query = session.createQuery("from media where lower(title) like :searchTerm");

        theSearchTerm = "%" + theSearchTerm.toLowerCase() + "%";

        query.setParameter("searchTerm", theSearchTerm);

        return query.getResultList();
    }

}
