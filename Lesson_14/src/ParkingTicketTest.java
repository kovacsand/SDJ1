public class ParkingTicketTest
{
  public static void main(String[] args)
  {
    ParkingMeter parkingMeter1 = new ParkingMeter(20);
    ParkedCar parkedCar1 = new ParkedCar("Audi", "A8", "black", "ABC-123", 141);
    PoliceOfficer policeOfficer1 = new PoliceOfficer("Bob", 123456);

    System.out.println(policeOfficer1.issueParkingTicket(parkedCar1, parkingMeter1).getFine());

  }
}
