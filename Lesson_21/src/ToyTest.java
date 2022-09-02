import java.util.ArrayList;

public class ToyTest
{
  public static void main(String[] args)
  {
    ArrayList<Toy> toys = new ArrayList<Toy>();
    toys.add(new Football(18, 20));
    toys.add(new Handball(14, 10));
    toys.add(new Lego(12, 350));

    for (int i = 0; i < toys.size(); i++)
      System.out.println(toys.get(i).play());
  }
}
