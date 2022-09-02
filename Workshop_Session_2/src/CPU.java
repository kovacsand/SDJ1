public class CPU
{
  private String brand;
  private String model;
  private double clockFrequency;
  private int cores;

  public CPU(String brand, String model, double clockFrequency, int cores)
  {
    this.brand = brand;
    this.model = model;
    this.clockFrequency = clockFrequency;
    this.cores = cores;
  }

  public String getBrand()
  {
    return brand;
  }

  public String getModel()
  {
    return model;
  }

  public double getClockFrequency()
  {
    return clockFrequency;
  }

  public int getCores()
  {
    return cores;
  }

  public String toString()
  {
    return String.format("The %s is made by %s, has %d cores, and a frequency of %f.\n", model, brand, cores, clockFrequency);
  }
}
