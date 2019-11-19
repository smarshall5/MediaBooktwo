package hibernate;


import hibernate.entity.category;
import hibernate.entity.media;
import hibernate.entity.mediatype;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateApp {

    private SessionFactory factory;

    private HibernateApp() {
        factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(category.class)
                .addAnnotatedClass(mediatype.class)
                .addAnnotatedClass(media.class)
                .buildSessionFactory();
    }

    private void close() {
        factory.close();
    }


    public static void main(String[] args) {
        HibernateApp app = new HibernateApp();
        try {
//uncomment to run sections
            System.out.println("______________");
       //    app.createCategory();
      //      app.readCategory();
      //      app.updatecategory();
      //      app.readCategory();
      //     app.deleteCategory();
       //     app.readCategory();
            System.out.println("______________");
      //    app.createMediaType();
        //    app.readMediaType();
        //    app.updateMediaType();
        //    app.readMediaType();
        //    app.deleteMediaType();
        //    app.readMediaType();
            System.out.println("______________");
         //  app.createMedia();
            app.readMedia();
        //    app.updateMedia();
            app.readMedia();
            //   app.deleteMedia();
            app.readMedia();

            System.out.println("____________________________");
        } finally {
            app.close();
        }
    }


    //category stuff
    private void createCategory() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        /** DO CRUD **/
        category aCategory = new category("coding");
        session.save(aCategory);
        session.getTransaction().commit();
    }

    private void readCategory() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<category> list = session.createQuery("from category").getResultList();
        categoryList(list);
        session.getTransaction().commit();

    }

    private void categoryList(List<category> list) {
        if (list.isEmpty()) {
            System.out.println("No categories");
        } else {
            for (category Category : list) {
                System.out.println(Category);
            }
        }
    }

    private void updatecategory() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<category> list =
                session.createQuery("from category ").getResultList();
        list.get(4).setName("superduper Sports");

        session.getTransaction().commit();

    }
    private void deleteCategory() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        category aCategory = session.get(category.class, 201);
        session.delete(aCategory);

        session.getTransaction().commit();
    }



    //MediaType stuff

    private void createMediaType() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        /** DO CRUD **/
        mediatype amediaType = new mediatype("film");
        session.save(amediaType);
        session.getTransaction().commit();
    }

    private void readMediaType() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<mediatype> list = session.createQuery("from mediatype").getResultList();
        mediaTypeList(list);
        session.getTransaction().commit();

    }

    private void mediaTypeList(List<mediatype> list) {
        if (list.isEmpty()) {
            System.out.println("No media Types");
        } else {
            for (mediatype Types : list) {
                System.out.println(Types);
            }
        }
    }

    private void updateMediaType() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<mediatype> list =
                session.createQuery("from mediatype ").getResultList();
        list.get(2).setName("books");

        session.getTransaction().commit();

    }
    private void deleteMediaType() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        mediatype amediaType = session.get(mediatype.class, 101);
        session.delete(amediaType);

        session.getTransaction().commit();
    }


//Media Stuff

    private void createMedia() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        /** DO CRUD **/
        mediatype mediaTypeOne = session.get(mediatype.class,1);
        category categoryOne = session.get(category.class,4);
        media aMedia = new media("taco",2019,"Sam");
        aMedia.setMediaType(mediaTypeOne);
        aMedia.setCategory(categoryOne);
        session.save(aMedia);
        session.getTransaction().commit();
    }

    private void readMedia() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<media> list = session.createQuery("from media").getResultList();
        mediaList(list);
        session.getTransaction().commit();

    }

    private void mediaList(List<media> list) {
        if (list.isEmpty()) {
            System.out.println("No Media");
        } else {
            for (media Media : list) {
                System.out.println(Media);
            }
        }
    }

    private void updateMedia() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<media> list =
                session.createQuery("from media ").getResultList();
        list.get(2).setTitle("Naruto");

        session.getTransaction().commit();

    }
    private void deleteMedia() {
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        media aMedia = session.get(media.class, 2);
        session.delete(aMedia);

        session.getTransaction().commit();
    }




}



