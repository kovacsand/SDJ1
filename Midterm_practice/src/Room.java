public class Room
{
  private int number;
          Guest guest;
          Bed bed;

  public Room(int number, String bedType)
  {
    this.number = number;
    this.bed = new Bed(bedType);
    this.guest = null;
  }

  public int getNumber()
  {
    return number;
  }

  public int getFloor()
  {
    return number/100;
  }

  public double getPrice()
  {
    if (bed.isSingle())
      return 59.50;
    if (bed.isDouble())
      return 72.40;
    return 89.00;
  }

  public boolean isOccupied()
  {
    return (guest != null);
  }

  public void registerGuest(Guest guest)
  {
    this.guest = guest;
  }

  public void vacate()
  {
    this.guest = null;
  }

  public String getBedType()
  {
    if (bed.isSingle())
      return "Single";
    if (bed.isDouble())
      return "Double";
    return "King size";
  }

  public Guest getGuest()
  {
    return guest;
  }
}
