package springmvc.dao;

import hibernate.entity.category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CategoryDao implements ICategoryDao {
    @Autowired
    private SessionFactory factory;

    @Transactional
    @Override
    public List<category> GetCategories() {

        Session session = factory.getCurrentSession();
        List<category> list = session.createQuery("from category ").getResultList();
        return list;
    }

    @Transactional
    @Override
    public category GetCategory(int id) {
        Session session = factory.getCurrentSession();
        category aCategory = session.get(category.class, id);
        return aCategory;
    }
}
