public class GarageTest
{
  public static void main(String[] args)
  {
    Car car1 = new Car("Audi", "A8", "white", "AAA-123", 2018);
    Car car2 = new Car("Audi", "A9", "black", 2020);
    Car car3 = new Car("Mercedes", "W3", "silver", "AAA-123", 2018);
    Car car4 = new Car("Lamborghini", "F3", "pink", 2020);

    Garage garage1 = new Garage();
    Garage garage2 = new Garage();

    System.out.println(garage1.isParkingAreaTaken(1));
    System.out.println(garage2.isParkingAreaTaken(2));

    garage1.park(car1, 1);
    garage2.park(car4, 2);
    garage1.park(car2, 1);

    System.out.println(garage1.leaveGarage(1));
    System.out.println(garage1.leaveGarage(2));

    System.out.println(garage1);
    System.out.println(garage2);

    garage2.leaveGarage(2);

    System.out.println(garage1.equals(garage2));

    garage2.park(car3,1);
    Car car5 = car3.copy();
    garage1.park(car5, 2);

    System.out.println(garage1.equals(garage2));
  }
}
