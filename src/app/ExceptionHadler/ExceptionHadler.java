package app.ExceptionHadler;

import app.ExceptionsValidator.ExceptionsValidator;
import com.sun.xml.internal.ws.handler.HandlerException;

public class ExceptionHadler {
    public String HandleException(String exception) {
        ExceptionsValidator validator = new ExceptionsValidator();
        try {
            return validator.validateHeight(validator.validateInputHeight(exception));
        } catch (IllegalArgumentException | HandlerException e) {
            return e.getMessage();
        }
    }
}
