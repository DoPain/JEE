package fr.iut;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Created by fred on 10/02/15.
 */
public class PersonTest {
    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        PersonTest.validator = factory.getValidator();
    }

    @Test
    public void testIsNotMajor() {
        Person p = new Person();
        p.setName("testIsNotMajor");
        p.setAge(10);

        Set<ConstraintViolation<Person>> violations = validator.validate(p);
        Assert.assertEquals(1, violations.size());
    }

    @Test
    public void testIsMajor() {
        Person p = new Person();
        p.setName("testIsMajor");
        p.setAge(19);
        p.setAge(18);

        Set<ConstraintViolation<Person>> violations = validator.validate(p);
        Assert.assertEquals(0, violations.size());
    }
}
