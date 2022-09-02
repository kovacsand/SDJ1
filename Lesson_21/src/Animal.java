public abstract class Animal
{
  private int age;

  public Animal(int age)
  {
    this.age = age;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public abstract String speak();

  public String toString()
  {
    return String.format("This animal is %d years old.\n", age);
  }
}
