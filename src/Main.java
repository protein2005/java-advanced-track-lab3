import annotations.Validator;

/**
 * The Main class demonstrates the usage of the Validator class
 * to validate objects of different classes using custom annotations.
 */
public class Main {

  /**
   * The main method is the entry point of the application.
   * It creates instances of Person, Product, and Car classes and validates them.
   */
  public static void main(String[] args) {
    Person person = new Person(null, 20);
    Product product = new Product("Laptop", "A");
    Car car1 = new Car("Tesla Model S", 1940);
    Car car2 = new Car("A", 2022);

    long startTime = System.currentTimeMillis();
    try {
      Validator.validate(person);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      Validator.validate(product);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      Validator.validate(car1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      Validator.validate(car2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    long endTime = System.currentTimeMillis();
    long reflectionTime = endTime - startTime;
    System.out.println("Reflection completion time: " + reflectionTime + "ms");

    startTime = System.currentTimeMillis();
    try {
      PersonValidator.validate(person);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      ProductValidator.validate(product);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      CarValidator.validate(car1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    try {
      CarValidator.validate(car2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    endTime = System.currentTimeMillis();
    long noReflectionTime = endTime - startTime;
    System.out.println("No reflection completion time: " + noReflectionTime + "ms");
  }
}
