package model;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CarModelManager
{
  private String fileName;

  public CarModelManager(String fileName)
  {
    this.fileName = fileName;
  }

  public CarList getAllCars()
  {
    CarList cars = new CarList();
    String[] carsArray = null;

    try
    {
      carsArray = MyFileHandler.readArrayFromTextFile(fileName);
      for (int i = 0; i < carsArray.length; i++)
      {
        String[] tempArray = carsArray[i].split(",");
        Owner tempOwner = new Owner(tempArray[4], tempArray[5]);
        cars.addCar(new Car(tempArray[0], tempArray[1], tempArray[2], Integer.parseInt(tempArray[3]), tempOwner));
      }
    }
    catch (FileNotFoundException e)
    {
      System.err.println("File not found: " + fileName);
    }
    return cars;
  }

  public void addCar(Car car)
  {
    CarList cars = getAllCars();

    if (cars.indexOfRegNumber(car.getRegNumber()) == -1)
    {
      String newCarString = String.format("%s,%s,%s,%d,%s,%s", car.getRegNumber(), car.getMake(), car.getModel(), car.getYear(), car.getOwner().getFirstName(), car.getOwner().getLastName());
      try
      {
        MyFileHandler.appendToTextFile(fileName, newCarString);
      }
      catch (FileNotFoundException e)
      {
        System.err.println("File not found: " + fileName);
      }
    }
  }

  public void addCars(CarList newCars)
  {
    for (int i = 0; i < newCars.size(); i++)
      addCar(newCars.getCar(i));
  }

  public void deleteCar(Car car)
  {
    CarList cars = getAllCars();
    try
    {
      PrintWriter pw = new PrintWriter(fileName);
      pw.close();
    }
    catch (FileNotFoundException e)
    {
      System.err.println("File not found: " + fileName);
    }
    for (int i = 0; i < cars.size(); i++)
      if (!cars.getCar(i).equals(car))
      {
        String newCarString = String.format("%s,%s,%s,%d,%s,%s",
            cars.getCar(i).getRegNumber(), cars.getCar(i).getMake(),
            cars.getCar(i).getModel(), cars.getCar(i).getYear(),
            cars.getCar(i).getOwner().getFirstName(),
            cars.getCar(i).getOwner().getLastName());
        try
        {
          MyFileHandler.appendToTextFile(fileName, newCarString);
        }
        catch (FileNotFoundException e)
        {
          System.err.println("File not found: " + fileName);
        }
      }
  }

  public void deleteCarByRegNumber(String regNumber)
  {
    CarList cars = getAllCars();
    for (int i = 0; i < cars.size(); i++)
      if (cars.getCar(i).getRegNumber().equals(regNumber))
        deleteCar(cars.getCar(i));
  }
}
