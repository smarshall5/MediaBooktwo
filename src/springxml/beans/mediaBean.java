package springxml.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springxml.services.IValidationService;

@Component
public class mediaBean implements IvalidateBeans {

    private int mediaID;
    private int mediaTypeID;
    private int categoryID;
    private String title;
    private int yearofmake;
    private String maker;
    private IValidationService _validationService;


    public mediaBean() {
        mediaID = 0;
        mediaTypeID=0;
        categoryID=0;
        title = "";
        yearofmake=0;
        maker="";
    }

    public void set_validationService(IValidationService _validationService) {
        this._validationService = _validationService;
    }

    public mediaBean(@Qualifier("mediaValidationService") IValidationService _validationService) {
        this._validationService = _validationService;
        System.out.println("Incorrect Incorrect");
    }
    public int getMediaID() {
        return mediaID;
    }

    public void setMediaID(int mediaID) {
        this.mediaID = mediaID;
    }
    public int getMediaTypeID() {
        return mediaTypeID;
    }

    public void setMediaTypeID(int mediaTypeID) {
        this.mediaTypeID = mediaTypeID;
    }


    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearofmake() {
        return yearofmake;
    }

    public void setYearofmake(int yearofmake) {
        this.yearofmake = yearofmake;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
    public boolean validateContent() {
        return _validationService.ValidateString(maker);
    }


}



