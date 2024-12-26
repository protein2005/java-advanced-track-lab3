import annotations.MaxValue;
import annotations.MinValue;
import annotations.NotNull;

/**
 * The Person class represents a person with a name and age.
 * It uses custom annotations to enforce validation constraints.
 */
public class Person {

  @NotNull
  private String name;

  @MinValue(18)
  @MaxValue(100)
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

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
}
