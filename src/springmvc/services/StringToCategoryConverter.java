package springmvc.services;

import hibernate.entity.category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToCategoryConverter implements Converter<String,category> {
    @Autowired
    private ICategoryService categoryService;

    @Override
    public category convert(String s) {
        int categoryID = Integer.parseInt(s);
        category Category = categoryService.getCategory(categoryID);

        return Category;
    }
}
