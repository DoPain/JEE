import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Set;

public class TestConstaints {

	private static class Person{
        @NotNull
	    private String name;

        @NotNull @Max(20) @Min(0)
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString(){
            return String.format("%s has %d years", name, age);
        }
    }


    private static void validate(Validator validator, Person p){
        System.out.println("Validation of "+p);
        Set<ConstraintViolation<Person>> violations =validator.validate(p);
        System.out.println("Nb violations " + violations.size());
        for( ConstraintViolation<Person> violation: violations){
            System.out.println("violation message : " +violation.getPropertyPath().toString() + " "+ violation.getMessage());
        }
    }

    public static void main(String [] args){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        // Validation objet
	    Person p2 = new Person();
        p2.setAge(2);
        p2.setName("XXX");
        validate(validator, p2);

        p2.setAge(-1);
        p2.setName(null);
        validate(validator, p2);


        // validation proprieté
        System.out.println("empty name: " + validator.validateProperty(p2, "name").size());
        p2.setName("Hello");
        System.out.println("name OK: " + validator.validateProperty(p2, "name").size());

	}
}
