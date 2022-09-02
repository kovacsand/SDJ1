package main;

import model.Car;
import model.CarList;
import model.CarModelManager;
import model.Owner;

public class CarTest
{
  public static void main(String[] args)
  {
    CarModelManager carModelManager = new CarModelManager("Lesson_25/cars.txt");

    CarList cars = carModelManager.getAllCars();

    for (int i = 0; i < cars.size(); i++)
      System.out.println(cars.getCar(i));

    System.out.println("------------------------------------------------");

    Car car1 = new Car("ABC123", "Tesla", "X", 2015, new Owner("Elon", "Musk"));
    Car car2 = new Car("XYZ789", "Tesla", "S", 2012, new Owner("Barack", "Obama"));
    Car car3 = new Car("ABC123", "Tesla", "X", 2015, new Owner("Elon", "Musk"));

    CarList carList = new CarList();
    carList.addCar(car1);
    carList.addCar(car2);
    carList.addCar(car1);
    carModelManager.addCars(carList);


    carModelManager.deleteCar(cars.getCar(0));

    carModelManager.deleteCarByRegNumber("ABC123");



    CarList updatedCarList = carModelManager.getAllCars();

    for (int i = 0; i < updatedCarList.size(); i++)
      System.out.println(updatedCarList.getCar(i));
  }
}
