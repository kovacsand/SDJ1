public class Car
{
  //INSTANCE VARIABLES
  private String make,
                 model,
                 color,
                 licenseNumber;
  private int year;

  //
  //METHODS
  //

  //5-argument constructor
  public Car(String make, String model, String color, String licenseNumber, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.year = year;
  }

  //4-argument constructor
  public Car(String make, String model, String color, int year)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.year = year;
    this.licenseNumber = null;
  }

  //GETTERS
  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public int getYear()
  {
    return year;
  }

  //SETTERS
  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }

  public Car copy()
  {
    return new Car(make, model, color, licenseNumber, year);
  }

  public String toString()
  {
    String str;
    str = String.format("The %s was made by %s in %d. It has an astonishing %s body.", model, make, year, color);
    if (licenseNumber != null)
    {
      str += String.format("\nIts license number is: %s", licenseNumber);
    }
    return str;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Car)
    {
      Car other = (Car) obj;
      if (licenseNumber != null && other.licenseNumber != null)
      {
        return make.equals(other.make) && model.equals(other.model) && color.equals(other.color) && year == other.year;
      }
      else if (licenseNumber == null && other.licenseNumber == null)
      {
        return make.equals(other.make) && model.equals(other.model) && color.equals(other.color) && year == other.year;
      }
    }
    return false;
  }
}
