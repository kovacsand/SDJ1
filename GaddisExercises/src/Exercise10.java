import java.util.Locale;

public class Exercise10
{
  public static void main(String[] args)
  {
    System.out.println(23 * 4.5 / 0.5 + 1); //208
    System.out.println(23 * 4.5 / (0.5 + 1)); //69
    System.out.println(2 + 5 - 18 + 11); //0
    System.out.println((2 + 5) - (18 + 11)); //-22
    System.out.println(14 * 18 / 4 + 4); //67
    System.out.println(14 * 18 / (4 + 4)); //31 instead of 31.5 because being a double
  }
}
