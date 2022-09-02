public class HotelTest
{
  public static void main(String[] args)
  {
    Room room1 = new Room(217, "Single");
    room1.registerGuest(new Guest("Andras"));
    Room room2 = new Room(612, "Double");
    room2.registerGuest(new Guest("Barb"));

    Hotel hotel1 = new Hotel("Grand Hotel Halmahera", new Room[]{room1, room2});
    System.out.println(hotel1.getName());
    System.out.println(hotel1.getNumberOfRooms());
    System.out.println(hotel1.getNumberOfAvailableRooms());
    room2.vacate();
    System.out.println(hotel1.getNumberOfAvailableRooms());
    System.out.println(hotel1.getFirstAvailableRoom().getBedType());
    System.out.println(hotel1.hasGuest(new Guest("Andras")));
  }
}
