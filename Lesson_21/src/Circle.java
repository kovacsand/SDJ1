public class Circle extends TwoDimensionalShape
{
  private double radius;

  public Circle(double x, double y, double radius)
  {
    super(x, y);
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public double getArea()
  {
    return Math.pow(radius, 2) * Math.PI;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Circle))
      return false;
    Circle other = (Circle) obj;
    return (super.equals(other) && radius == other.radius);
  }

  public String toString()
  {
    return String.format("%sIts a circle with a radius of: %f\nIts area is: %f\n", super.toString(), radius, getArea());
  }
}
