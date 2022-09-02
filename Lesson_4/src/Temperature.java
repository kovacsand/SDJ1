public class Temperature
{
  private double ftemp;

  public Temperature(double ftemp)
  {
    this.ftemp = ftemp;
  }
  public void setFahrenheit(double ftemp)
  {
    this.ftemp = ftemp;
  }
  public double getFahrenheit()
  {
    return ftemp;
  }
  public double getCelsius()
  {
    return (ftemp-32)*(5.0/9);
  }
  public double getKelvin()
  {
    return ((ftemp-32)*(5.0/9)) +273;
  }
}
