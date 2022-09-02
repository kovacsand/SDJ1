public class Circle
{
  private double radius;
  private Point center;

  public Circle(double x, double y, double radius)
  {
    this.radius = radius;
    this.center = new Point(x, y);
  }

  public double getRadius()
  {
    return radius;
  }

  public Point getCenter()
  {
    return center.copy();
  }

  public void move(double dx, double dy)
  {
    center.move(dx, dy);
  }

  public double getArea()
  {
    return Math.pow(radius, 2) * Math.PI;
  }

  public String toString()
  {
    return String.format("The circles radius is: %f\nIts coordinates are: %f, %f\nIts area is: %f\n", radius, center.getX(), center.getY(), getArea());
  }
}
