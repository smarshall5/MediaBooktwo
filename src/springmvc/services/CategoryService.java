package springmvc.services;

import hibernate.entity.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.dao.ICategoryDao;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    public List<category> getCategory() {
        return categoryDao.GetCategories();
    }

    @Override
    public category getCategory(int id) {
        return categoryDao.GetCategory(id);
    }
}
