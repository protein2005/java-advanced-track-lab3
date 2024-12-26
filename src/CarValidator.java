/**
 * Class that validates the fields of a Car instance based on the constraints.
 */
public class CarValidator {

  /**
   * Validates the fields of the Car instance based on the constraints.
   *
   * @param car the Car instance to validate
   * @throws IllegalArgumentException if any validation constraint is violated
   */
  public static void validate(Car car) {
    if (car.getModel() == null) {
      throw new IllegalArgumentException("Field 'model' in class Car cannot be null.");
    }
    if (car.getModel().length() < 3 || car.getModel().length() > 80) {
      throw new IllegalArgumentException("Field 'model' in class Car must have length between 3 and 80.");
    }
    if (car.getYear() < 1960 || car.getYear() > 2024) {
      throw new IllegalArgumentException("Field 'year' in class Car must be between 1960 and 2022.");
    }
  }
}
