public class PoliceOfficer
{
  private String name;
          int badgeNumber;

  public PoliceOfficer(String name, int badgeNumber)
  {
    this.name = name;
    this.badgeNumber = badgeNumber;
  }

  public String getName()
  {
    return name;
  }

  public int getBadgeNumber()
  {
    return badgeNumber;
  }

  //returns true if the parking time has expired
  public boolean examineParkedCar(ParkedCar parkedCar, ParkingMeter parkingMeter)
  {
    return  (parkedCar.getMinutesParked() > parkingMeter.getParkingMinutesPurchased());
  }

  public ParkingTicket issueParkingTicket(ParkedCar parkedCar, ParkingMeter parkingMeter)
  {
    ParkingTicket parkingTicket1 = new ParkingTicket(parkedCar, this);
    parkingTicket1.setFine(parkedCar.getMinutesParked() - parkingMeter.getParkingMinutesPurchased());
    return parkingTicket1;
  }
}
