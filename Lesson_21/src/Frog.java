public class Frog extends Animal
{
  private String colour;

  public Frog(int age, String colour)
  {
    super(age);
    this.colour = colour;
  }

  public String speak()
  {
    return "Ribbit";
  }
}
