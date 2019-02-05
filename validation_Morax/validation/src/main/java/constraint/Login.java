package constraint;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LoginValidator.class)
public @interface Login {
    String message() default "login non valide";
    Class<?>[] groups() default {}; // Groupe de validation partiel
    Class<? extends Payload>[] payload() default{}; // Metadonnée de la contrainte
}
