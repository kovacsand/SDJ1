import java.util.ArrayList;

public class FerrySchedule
{
  private ArrayList<Departure> departures;

  public FerrySchedule()
  {
    this.departures = new ArrayList<>();
  }

  public void addDeparture(String dayAndTime, Trip trip)
  {
    departures.add(new Departure(dayAndTime, trip));
  }

  public int getDepartureCount()
  {
    return departures.size();
  }

  public Departure getDeparture(int index)
  {
    return departures.get(index);
  }

  public ArrayList<Departure> getDeparturesFrom(Harbor harbor)
  {
    ArrayList<Departure> temp = new ArrayList<>();
    for (int i = 0; i < getDepartureCount(); i++)
      if (departures.get(i).getFrom().equals(harbor))
        temp.add(departures.get(i));
    return temp;
  }
}
