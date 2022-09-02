public class ParkedCar
{
  private String make,
                 model,
                 color,
                 licenseNumber;
          int minutesParked;

  public ParkedCar(String make, String model, String color, String licenseNumber, int minutesParked)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.minutesParked = minutesParked;
  }

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

  public int getMinutesParked()
  {
    return minutesParked;
  }
}
