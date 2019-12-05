package hibernate.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="MEDIATYPE")
public class mediatype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MediaTypeID")
    private int mediaTypeId;


    @Column(name="NAME")
    private String Name;


    //one mediaType to many in media
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,
    mappedBy = "mediaType")
    private List<media> mediaList;

    public mediatype(){}

    public mediatype(String name){
        Name=name;
    }


    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
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
        return "mediatype{" +
                "Id=" + mediaTypeId +
                ", name='" + Name + '\'' +
                '}';
    }
}
