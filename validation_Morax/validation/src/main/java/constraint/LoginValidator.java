package constraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidator implements ConstraintValidator<Login, String> {
    int maxSize = 8;
    int minSize = 2;

    @Override
    public void initialize(final Login login) {
    }

    @Override
    public boolean isValid(final String s, final ConstraintValidatorContext constraintValidatorContext) {
        return s!=null && (s.length()<= maxSize) && (s.length()>=minSize) && (s.matches("[a-zA-Z]+"));
    }
}
