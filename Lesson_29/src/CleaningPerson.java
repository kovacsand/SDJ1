import java.util.ArrayList;

public class CleaningPerson extends Employee
{
  private ArrayList<Room> rooms;

  public CleaningPerson(int number, String name)
  {
    super(number, name);
    this.rooms = new ArrayList<>();
  }

  public void addRoom(Room room)
  {
    rooms.add(room);
  }

  public void removeRoom(Room room)
  {
    rooms.remove(room);
  }

  public boolean cleansRoom(int roomNumber)
  {
    for (int i = 0; i < rooms.size(); i++)
      if (rooms.get(i).getNo() == roomNumber)
        return true;
    return false;
  }
}
