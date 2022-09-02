public class Garage
{
  private Car car1,
              car2;

  public Garage()
  {
    car1 = null;
    car2 = null;
  }

  public boolean isParkingAreaTaken(int position)
  {
    if (position == 1 && car1 != null)
    {
      return true;
    }
    else if (position == 2 && car2 != null)
    {
      return true;
    }
    return false;
  }

  public void park(Car car, int position)
  {
    if (position == 1 && car1 == null)
    {
      car1 = car;
    }
    else if (position == 2 && car2 == null)
    {
      car2 = car;
    }
  }

  public Car leaveGarage(int position)
  {
    if (position == 1 && car1 != null)
    {
      Car tempCar = car1.copy();
      car1 = null;
      return tempCar;
    }
    else if (position == 2 && car2 != null)
    {
      Car tempCar = car2.copy();
      car2 = null;
      return tempCar;
    }
    else
      return null;
  }

  public String toString()
  {
    String str = "";

    if (car1 != null)
    {
      str += String.format("In the first space there is a %s parked.", car1);
    }

    if (car2 != null)
    {
      str += String.format("\nIn the second space there is a %s parked.", car2);
    }

    if (car1 == null && car2 == null)
    {
      str += String.format("The garage is empty.");
    }

    return str;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Garage)
    {
      Garage other = (Garage) obj;

      if (car1 == null && car2 == null && other.car1 == null && other.car2 == null)
        return true;
      if (car1 == null && car2 != null && other.car1 == null && other.car2.equals(car2))
        return true;
      if (car1 != null && car2 == null && other.car1.equals(car1) && other.car2 == null)
        return true;
      if (car1 != null && car2 != null && other.car1.equals(car1) && other.car2.equals(car2))
        return true;
    }
    return false;
  }
}
