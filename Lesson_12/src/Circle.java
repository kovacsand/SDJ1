public class Circle
{
  private double radius;

  //0-argument constructor
  public Circle()
  {
    radius = 0;
  }
  //1-argument constructor
  public Circle(int radius)
  {
    this.radius = radius;
  }

  private double getArea()
  {
    return Math.pow(radius, 2) * Math.PI;
  }

  public String toString()
  {
    return String.format("This is a circle with a radius of: %f, and its area is: %f", radius, getArea());
  }

  public boolean equals(Circle obj)
  {
    if (radius == obj.radius)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public boolean greaterThan(Circle obj)
  {
    if (obj.getArea() > getArea())
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
