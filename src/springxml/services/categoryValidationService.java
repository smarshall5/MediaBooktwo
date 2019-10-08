package springxml.services;

import org.springframework.stereotype.Service;

@Service
public class categoryValidationService implements IValidationService {
    @Override
    public String ValidationStatement() {
        return "Check Your submission.";
    }

    @Override
    public boolean ValidateString(String name) {
       return !name.contains(" ");
    }

}