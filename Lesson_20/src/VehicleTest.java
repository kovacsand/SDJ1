public class VehicleTest
{
  public static void main(String[] args)
  {
    Van van1 = new Van("John", 200, "ABC123", 300);
    Van van2 = new Van("John", 2000, "ABC123", 300);
    SportsCar sportsCar1 = new SportsCar("Bob", 20000, "XY987", 250);
    Bicycle bicycle1 = new Bicycle("Adam", 50, 7);
    System.out.println(van1);
    System.out.println(sportsCar1);
    System.out.println(bicycle1);
  }
}
