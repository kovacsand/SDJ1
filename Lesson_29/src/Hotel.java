import java.util.ArrayList;

public class Hotel
{
  private String name;
  private String address;
  private ArrayList<Room> rooms;
  private ArrayList<Employee> employees;

  public Hotel(String name, String address, Room[] rooms)
  {
    this.name = name;
    this.address = address;
    this.rooms = new ArrayList<>();
    for (int i = 0; i < rooms.length; i++)
      this.rooms.add(rooms[i]);
    this.employees = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public Room getRoom(int roomNumber)
  {
    for (int i = 0; i < rooms.size(); i++)
      if (rooms.get(i).getNo() == roomNumber)
        return rooms.get(i);
    return null;
  }

  public void hireReceptionist(int number, String name)
  {
    employees.add(new Receptionist(number, name));
  }

  public void hireCleaningPerson(int number, String name)
  {
    employees.add(new CleaningPerson(number, name));
  }

  public void fireEmployee(int number)
  {
    for (int i = 0; i < employees.size(); i++)
      if (employees.get(i).getNumber() == number)
        employees.remove(i);
  }

  public CleaningPerson getCleaningPersonForRoom(int roomNumber)
  {
    for (int i = 0; i < employees.size(); i++)
      if (employees.get(i) instanceof CleaningPerson && ((CleaningPerson) employees.get(i)).cleansRoom(roomNumber))
        return (CleaningPerson) employees.get(i);
    return null;
  }

  public void setCleaningPersonForRoom(int roomNumber, int employeeNumber)
  {
    for (int i = 0; i < employees.size(); i++)
      if (employees.get(i) instanceof CleaningPerson && employees.get(i).getNumber() == employeeNumber)
        ((CleaningPerson) employees.get(i)).addRoom(getRoom(roomNumber));
  }
}
