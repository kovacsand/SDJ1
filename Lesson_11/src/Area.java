public class Area
{
  //Circle
  public static double area(double radius)
  {
    return Math.pow(radius, 2) * Math.PI;
  }

  //Rectangle
  public static double area(float width, float length)
  {
    return width * length;
  }

  //Cylinder
  public static double area(double radius, double height)
  {
    return Math.pow(radius, 2) * Math.PI * height;
  }
}
