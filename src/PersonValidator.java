/**
 * Class that validates the fields of a Person instance based on the constraints.
 */
public class PersonValidator {

  /**
   * Validates the fields of the Person instance based on the constraints.
   *
   * @param person the Person instance to validate
   * @throws IllegalArgumentException if any validation constraint is violated
   */
  public static void validate(Person person) {
    if (person.getName() == null) {
      throw new IllegalArgumentException("Field 'name' in class Person cannot be null.");
    }
    if (person.getAge() < 18 || person.getAge() > 100) {
      throw new IllegalArgumentException("Field 'age' in class Person must be between 18 and 100.");
    }
  }
}
