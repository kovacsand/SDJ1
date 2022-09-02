public class RoomCarpet
{
  private RoomDimension size;
  private double carpetCost;

  public RoomCarpet(RoomDimension dim, double cost)
  {
    size = dim;
    carpetCost = cost;
  }

  public double getTotalCost()
  {
    return size.getArea() * carpetCost;
  }

  public String toString()
  {
    return String.format("To carpet the whole room it costs: %f", getTotalCost());
  }
}
