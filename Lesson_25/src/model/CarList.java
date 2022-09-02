package model;

import java.util.ArrayList;

public class CarList
{
  ArrayList<Car> cars;

  public CarList()
  {
    cars = new ArrayList<Car>();
  }

  public int size()
  {
    return cars.size();
  }

  public int indexOfRegNumber(String regNumber)
  {
    for (int i = 0; i < size(); i++)
      if (cars.get(i).getRegNumber().equals(regNumber))
        return i;
    return -1;
  }

  public Car getCar(int index)
  {
    return cars.get(index);
  }

  public Car getCar(String regNumber)
  {
    if (indexOfRegNumber(regNumber) == -1)
      return null;
    return cars.get(indexOfRegNumber(regNumber));
  }

  public void addCar(Car car)
  {
    if (indexOfRegNumber(car.getRegNumber()) == -1)
      cars.add(car);
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < cars.size(); i++)
      str += cars.get(i) + "\n";
    return str;
  }
}
