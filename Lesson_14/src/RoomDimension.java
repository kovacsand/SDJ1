public class RoomDimension
{
  private double length,
                 width;

  public RoomDimension(double len, double w)
  {
    length = len;
    width = w;
  }

  public double getArea()
  {
    return width * length;
  }

  public String toString()
  {
    return String.format("The room is %f wide and %f long. Its area is %f.", width, length, getArea());
  }
}
