package springxml.beans;


import org.springframework.stereotype.Component;
import springxml.services.IValidationService;

@Component
public class categoryBean implements IvalidateBeans {
    private int categoryID;
    private String name;
    private IValidationService _validationService;
    public categoryBean() {
        categoryID = 0;
        String name = "";
    }
    public categoryBean(IValidationService _validationService) {
        categoryID = 0;
        String name = "";
        this._validationService = _validationService;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
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

    public boolean validateContent() {
        return _validationService.ValidateString(name);
    }
}

