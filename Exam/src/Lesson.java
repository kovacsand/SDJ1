import java.util.ArrayList;

public abstract class Lesson
{
  private String topic;
  private Date date;
  private ArrayList<Resource> resources;
  private Time start;
  private Time end;

  public Lesson(String topic, Date date, Time start, Time end, Resource[] res)
  {
    if (hasValidTime(start, end))
    {
      this.topic = topic;
      this.date = date.copy();
      this.start = start.copy();
      this.end = end.copy();
      resources = new ArrayList<>(res.length);
      for (int i = 0; i < res.length; i++)
        resources.add(res[i]);
    }
    else
      System.out.println("Invalid time");
  }

  public String getTopic()
  {
    return topic;
  }

  public Date getDate()
  {
    return date.copy();
  }

  public Resource[] getResources()
  {
    return resources.toArray(new Resource[resources.size()]);
  }

  public ArrayList<Resource> getAllPDFs()
  {
    ArrayList<Resource> temp = new ArrayList<>();
    for (int i = 0; i < resources.size(); i++)
    {
      if (resources.get(i).isPdf())
        temp.add(resources.get(i));
    }
    return temp;
  }

  public Time getDuration()
  {
    return start.timeUntil(end);
  }

  public static boolean hasValidTime(Time startTime, Time endTime)
  {
    Time tempStart = new Time(8, 20, 0);
    Time tempEnd = new Time(21, 10, 0);
    if (startTime.isBefore(tempStart) || tempEnd.isBefore(endTime) || endTime.isBefore(startTime))
      return false;
    return true;
  }

  public String getDateTimeString()
  {
    return String.format("%s %s - %s", date, start, end);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Lesson))
      return false;
    Lesson other = (Lesson) obj;
    return (topic.equals(other.topic) && date.equals(other.date) && resources.equals(other.resources) && start.equals(other.start) && end.equals(other.end));
  }

  public String toString()
  {
    String temp = "";
    temp += topic + "\n" + getDateTimeString();
    for (int i = 0; i < resources.size(); i++)
    {
      temp += "\n" + resources.get(i);
    }
    return temp;
  }
}
