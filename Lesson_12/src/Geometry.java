public class Geometry
{
  public static double Area(double radius)
  {
    if (radius < 0)
    {
      System.out.println("Error");
      return -1;
    }
    else
    {
      return Math.pow(radius, 2) * Math.PI;
    }
  }
  public static double Area(double length, double width)
  {
    if (length < 0 || width < 0)
    {
      System.out.println("Error");
      return -1;
    }
    else
    {
      return length * width;
    }
  }
  public static float Area(float base, float height)
  {
    if (base < 0 || height < 0)
    {
      System.out.println("Error");
      return -1;
    }
    else
    {
      return base * height * (float) 0.5;
    }
  }
}
