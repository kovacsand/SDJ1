import java.util.ArrayList;

public class AnimalTest
{
  public static void main(String[] args)
  {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    animals.add(new Frog(2, "Green"));
    animals.add(new Bee(1));
    animals.add(new Dog(4, "Ellie", "Beagle"));
    animals.add(new Cat(3, "Ciculi"));

    for (int i = 0; i < animals.size(); i++)
      System.out.println(animals.get(i).speak());
  }
}
