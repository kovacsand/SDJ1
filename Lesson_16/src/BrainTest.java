public class BrainTest
{
  public static void main(String[] args)
  {
    Brain brain1 = new Brain(4);

    brain1.remember("apple");
    brain1.remember("banana");
    brain1.remember("carrot");
    brain1.remember("date");

    //System.out.println(brain1.getIQ());
    //System.out.println(brain1.isBrainDamaged());

    System.out.println(brain1);

    brain1.refreshMemory("apple");
    brain1.refreshMemory("date");
    System.out.println(brain1);

    Brain brain2 = new Brain(4);
    Brain brain3 = new Brain(4);

    System.out.println(brain2.equals(brain3));
  }
}
