package springmvc.dao;

import hibernate.entity.category;

import java.util.List;

public interface ICategoryDao {
    List<category> GetCategories();
    category GetCategory(int id);
}
