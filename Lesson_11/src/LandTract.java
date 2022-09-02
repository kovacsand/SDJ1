public class LandTract
{
  private double width,
                 length;


  public LandTract(double width, double length)
  {
    this.width = width;
    this.length = length;
  }

  public double area()
  {
    return width * length;
  }

  public boolean equals(LandTract obj)
  {
    if (this.area() == obj.area())
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public String toString()
  {
    return "This tract is " + length + " long and " + width + " wide. Its area is " + this.area() + ".";
  }
}
