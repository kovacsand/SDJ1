public class SportsCar extends Car
{
  private int maxVelocity;

  public SportsCar(String owner, double price, String regNo, int maxVelocity)
  {
    super(owner, price, regNo);
    this.maxVelocity = maxVelocity;
  }

  public int getMaxVelocity()
  {
    return maxVelocity;
  }

  public String toString()
  {
    return String.format("%sIt is a sports car, its maximum velocity is: %d\n", super.toString(), maxVelocity);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof SportsCar))
      return false;
    SportsCar other = (SportsCar) obj;
    return super.equals(other) && maxVelocity == other.maxVelocity;
  }
}
