import java.util.ArrayList;

public class Hotel
{
  private String name;
          ArrayList<Room> rooms = new ArrayList<Room>();

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    for (int i = 0; i < rooms.length; i++)
      this.rooms.add(rooms[i]);
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.size();
  }

  public int getNumberOfAvailableRooms()
  {
    int counter = 0;
    for (int i = 0; i < getNumberOfRooms(); i++)
      if (!rooms.get(i).isOccupied())
        counter++;
    return counter;
  }

  public Room getFirstAvailableRoom()
  {
    for (int i = 0; i < getNumberOfRooms(); i++)
      if (!rooms.get(i).isOccupied())
        return rooms.get(i);
    return null;
  }

  public Room getFirstAvailableRoom(double maxPrice)
  {
    for (int i = 0; i < getNumberOfRooms(); i++)
      if (!rooms.get(i).isOccupied() && rooms.get(i).getPrice() <= maxPrice)
        return rooms.get(i);
    return null;
  }

  public Room[] getAllAvailableRooms(String bedType)
  {
    int counter = 0;
    for (int i = 0; i < getNumberOfRooms(); i++)
      if (!rooms.get(i).isOccupied() && rooms.get(i).getBedType().equals(bedType))
        counter++;
    Room[] temp = new Room[counter];
    counter = 0;
    for (int i = 0; i < getNumberOfRooms(); i++)
      if (!rooms.get(i).isOccupied() && rooms.get(i).getBedType().equals(bedType))
        temp[counter++] = rooms.get(i);
    return temp;
  }

  public boolean hasGuest(Guest guest)
  {
    for (int i = 0; i < getNumberOfRooms(); i++)
      if (rooms.get(i).isOccupied() && rooms.get(i).getGuest().equals(guest))
        return true;
    return false;
  }

  public Room getRoom(Guest guest)
  {
    for (int i = 0; i < getNumberOfRooms(); i++)
      if (rooms.get(i).isOccupied() && rooms.get(i).getGuest().equals(guest))
        return rooms.get(i);
    return null;
  }
}
