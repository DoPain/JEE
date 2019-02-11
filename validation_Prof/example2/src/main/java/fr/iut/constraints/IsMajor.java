package fr.iut.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by fred on 10/02/15.
 */
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IsMajorValidator.class)
public @interface IsMajor {
    String message() default "Majorité non atteinte";
    Class<?>[] groups() default {}; // Groupe de validation partiel
    Class<? extends Payload>[] payload() default{}; // Metadonnée de la contrainte
}
