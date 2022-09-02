public class Dog extends Pet
{
  private String breed;

  public Dog(int age, String name, String breed)
  {
    super(age, name);
    this.breed = breed;
  }

  public String speak()
  {
    return "Woof";
  }
}
