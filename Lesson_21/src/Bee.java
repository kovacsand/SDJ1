public class Bee extends Animal
{
  private boolean isAHoneyBee;

  public Bee(int age)
  {
    super(age);
    this.isAHoneyBee = false;
  }

  public String speak()
  {
    return "Bzzz";
  }
}
