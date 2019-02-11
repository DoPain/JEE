package fr.iut.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by fred on 10/02/15.
 */
public class IsMajorValidator implements ConstraintValidator<IsMajor, Integer> {
    private final static int FRENCH_MAJORITY = 18;

    @Override
    public void initialize(final IsMajor isMajor) {

    }

    @Override
    public boolean isValid(final Integer value, final ConstraintValidatorContext constraintValidatorContext) {
        return value >= FRENCH_MAJORITY;
    }
}
