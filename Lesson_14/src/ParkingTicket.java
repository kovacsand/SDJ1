public class ParkingTicket
{
  private ParkedCar parkedCar;
          PoliceOfficer policeOfficer;
          int fine;

  public ParkingTicket(ParkedCar parkedCar, PoliceOfficer policeOfficer)
  {
    this.parkedCar = parkedCar;
    this.policeOfficer = policeOfficer;
    this.fine = 0;
  }

  public PoliceOfficer getPoliceOfficer()
  {
    return policeOfficer;
  }

  public ParkedCar getIllegallyParkedCar()
  {
    return parkedCar;
  }

  public void setFine(int illegallyParkedMinutes)
  {
    int total = 0;
    if (illegallyParkedMinutes < 1)
    {
      fine = 0;
      return;
    }
    while (illegallyParkedMinutes > 60)
    {
      total += 10;
      illegallyParkedMinutes -= 60;
    }
    total += 25;
    fine = total;
  }

  public int getFine()
  {
    return fine;
  }
}
