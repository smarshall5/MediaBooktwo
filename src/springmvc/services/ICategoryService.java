package springmvc.services;



import hibernate.entity.category;

import java.util.List;

public interface ICategoryService {
    List<category> getCategory();

    category getCategory(int id);
}
