public class CarTest
{
  public static void main(String[] args)
  {
    Car car = new Car(2020, "Tesla");

    car.accelerate();
    System.out.println("Current speed is: " + car.getSpeed());
    car.accelerate();
    System.out.println("Current speed is: " + car.getSpeed());
    car.accelerate();
    System.out.println("Current speed is: " + car.getSpeed());
    car.accelerate();
    System.out.println("Current speed is: " + car.getSpeed());
    car.accelerate();
    System.out.println("Current speed is: " + car.getSpeed());

    car.brake();
    System.out.println("Current speed is: " + car.getSpeed());
    car.brake();
    System.out.println("Current speed is: " + car.getSpeed());
    car.brake();
    System.out.println("Current speed is: " + car.getSpeed());
    car.brake();
    System.out.println("Current speed is: " + car.getSpeed());
    car.brake();
    System.out.println("Current speed is: " + car.getSpeed());

  }
}
