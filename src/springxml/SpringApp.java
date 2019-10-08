package springxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springxml.beans.categoryBean;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        categoryBean category = context.getBean("categoryBean", categoryBean.class);

        System.out.println("categoryID: " + category.getCategoryID());
        System.out.println("name: " + category.getName());
        System.out.println("name is correct: " + category.validateContent());

        context.close();
    }
}
