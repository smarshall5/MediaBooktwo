package hibernate.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Media")
public class media {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MediaID")
    private int mediaID;

    //there can be only one mediatype per media, but many usages of mediatype.use all cascade types except delete, as
    //  I do not want when media is deleted to delete the mediatype.
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "mediaTypeID")
    private mediatype mediaType;

    //there can be only one category per media, but many usages of category. use all cascade types except delete, as
    // I do not want when media is deleted to delete category.
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "CATEGORYID")
    private category category;

    @NotNull(message="Need Title")
    @Column(name="TITLE")
    private String title;

    @NotNull(message="Need Year of Make")
    @Column(name="YEAROFMAKE")
    private int yearofMake;

    @NotNull(message="Need Who made it")
    @Column(name="MAKER")
    private String maker;

    public media(){
    }

    public media(String title, int yearofMake, String maker) {
        this.title = title;
        this.yearofMake = yearofMake;
        this.maker = maker;
    }

    public int getMediaID() {
        return mediaID;
    }

    public void setMediaID(int mediaID) {
        this.mediaID = mediaID;
    }

    public mediatype getMediaType() {
        return mediaType;
    }

    public void setMediaType(mediatype mediaType) {
        this.mediaType = mediaType;
    }

    public hibernate.entity.category getCategory() {
        return category;
    }

    public void setCategory(hibernate.entity.category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearofMake() {
        return yearofMake;
    }

    public void setYearofMake(int yearofMake) {
        this.yearofMake = yearofMake;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }



    @Override
    public String toString() {
        return "Media{" +
                "Id=" + mediaID +
                "mediaType=" + mediaType +
                "category=" + category +
                ", title='" + title +
                ", yearofMake='" + yearofMake +
                ", Creator='" + maker +'\'' +
                '}';
    }

}
