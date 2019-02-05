package fr.iut;


import bean.Person;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class LoginTest {
    private static Validator validator;
    Set<ConstraintViolation<Person>> violations;
    private static Person p ;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        LoginTest.validator = factory.getValidator();
        p = new Person();
        p.setFirstName("dorian");
        p.setLastName("morax");
        p.setEmail("dmorax@orange.fr");

    }

    @Test
    public void testLoginTooShort() {
        p.setLogin("a");
        violations = validator.validate(p);
        Assert.assertEquals(1, violations.size());
    }

    @Test
    public void TestLoginTooLong() {
        p.setLogin("aaaaaaaaaa");
        violations = validator.validate(p);
        Assert.assertEquals(1, violations.size());
    }

    @Test
    public void testNOk(){
        Person p2 = new Person();
        p2.setFirstName("21");
        p2.setLastName("a");
        p2.setEmail("21");
        p2.setLogin(null);
        violations = validator.validate(p2);
        Assert.assertEquals(4, violations.size());
    }
}

