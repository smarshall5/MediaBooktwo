package springxml.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springxml.services.IValidationService;

public class mediaTypeBean implements IvalidateBeans {


    private int mediaTypeID=0;
    private String name="";
    private IValidationService _validationService;

    public int getMediaTypeID() {
        return mediaTypeID;
    }

    public void setMediaTypeID(int mediaTypeID) {
        this.mediaTypeID = mediaTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void set_validationService(IValidationService _validationService) {
        this._validationService = _validationService;
    }

    public mediaTypeBean(@Qualifier("mediaTypeValidationService") IValidationService _validationService) {
        this._validationService = _validationService;
        System.out.println("Incorrect Incorrect");

    }

    public boolean validateContent() {
        return _validationService.ValidateString(name);
    }

}
