/**
 * Class that validates the fields of a Product instance based on the constraints.
 */
public class ProductValidator {

  /**
   * Validates the fields of the Product instance based on the constraints.
   *
   * @param product the Product instance to validate
   * @throws IllegalArgumentException if any validation constraint is violated
   */
  public static void validate(Product product) {
    if (product.getTitle() == null) {
      throw new IllegalArgumentException("Field 'title' in class Product cannot be null.");
    }
    if (product.getDescription().length() < 3 || product.getDescription().length() > 100) {
      throw new IllegalArgumentException("Field 'description' in class Product must have length between 3 and 100.");
    }
  }
}
