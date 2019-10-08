package springxml.services;

import org.springframework.stereotype.Service;

    @Service
    public class mediaValidationService implements IValidationService {
        @Override
        public String ValidationStatement() {
            return "Check Your submission.";
        }

        @Override
        public boolean ValidateString(String maker) {
            return !maker.contains(" ");
        }

}
