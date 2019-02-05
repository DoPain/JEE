package fr.iut;


import bean.Person;
import junit.framework.Assert;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class LoginTest {
    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        LoginTest.validator = factory.getValidator();
    }

    @Test
    public void testLoginTooShort() {
        Person p = new Person();
        p.setLogin("a");
        Set<ConstraintViolation<Person>> violations = validator.validate(p);
        Assert.assertEquals(1, violations.size());
    }

    @Test
    public void TestLoginTooLong() {

        Set<ConstraintViolation<Person>> violations = validator.validate(p);
        Assert.assertEquals(0, violations.size());
    }
}
