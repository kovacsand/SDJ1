public class CarTest
{
  public static void main(String[] args)
  {
    Car car1 = new Car("Audi", "A8", "white", "AAA-123", 2018);
    Car car2 = new Car("Audi", "A9", "black", 2020);
    Car car3 = car2.copy();
    car3.setLicenseNumber("ABC-987");

    System.out.println(car1);
    System.out.println(car2);
    System.out.println(car3);
    System.out.println(car2.equals(car3));
  }
}
