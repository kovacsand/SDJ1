public class Cat extends Pet
{
  private boolean isAHouseCat;

  public Cat(int age, String name)
  {
    super(age, name);
    this.isAHouseCat = false;
  }

  public String speak()
  {
    return "Meow";
  }
}
