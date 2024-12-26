import annotations.MaxValue;
import annotations.MinValue;
import annotations.NotNull;
import annotations.StringLength;

/**
 * The Car class represents a car with a model and year.
 * It uses custom validation.
 */
public class Car {

  @NotNull
  @StringLength(min = 3, max = 80)
  private String model;

  @MinValue(1960)
  @MaxValue(2024)
  private int year;

  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
