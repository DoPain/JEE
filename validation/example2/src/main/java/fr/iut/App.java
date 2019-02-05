package fr.iut;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;


public class App {
    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Person p1 = new Person();
        p1.setName("Jean");
        p1.setAge(-2);
        validPerson(validator, p1);

        Person p2 = new Person();
        p2.setName("Jean");
        p2.setAge(10);
        validPerson(validator, p2);

        Person p3 = new Person();
        p3.setName("Jean");
        p3.setAge(19);
        validPerson(validator, p3);

    }

    public static void validPerson(Validator validator, Person p) {
        Set<ConstraintViolation<Person>> violations = validator.validate(p);
        System.out.println("Nb violation " + violations.size());
        for (ConstraintViolation<Person> violation : violations) {
            System.out.println("violation " + violation.getPropertyPath().toString() + " is " + violation.getMessage());
        }
    }
}
