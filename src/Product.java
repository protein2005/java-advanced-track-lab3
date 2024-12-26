import annotations.NotNull;
import annotations.StringLength;

/**
 * The Product class represents a product with a title and description.
 * It uses custom annotations to enforce validation constraints.
 */
public class Product {

  @NotNull
  private String title;

  @StringLength(min = 3, max = 100)
  private String description;

  public Product(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}