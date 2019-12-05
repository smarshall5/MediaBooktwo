package hibernate.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="CATEGORY")
public class category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CATEGORYID")
    private int categoryId;

    @Column(name="NAME")
    private String Name;

    //one to many, with category being able to bind to multiple media, but only allowing one category
    //for each media.
    @OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER,
            mappedBy = "category")
    private List<media> mediaList;

    public category() {
        // no-arg constructor
    }

    public category(String name) {
        Name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public List<media> getMediaList() {
        return mediaList;
    }

    public void setMediaList(List<media> mediaList) {
        this.mediaList = mediaList;
    }

    @Override
    public String toString() {
        return "category{" +
                "Id=" + categoryId +
                ", Name='" + Name + '\'' +
                '}';
    }


}
