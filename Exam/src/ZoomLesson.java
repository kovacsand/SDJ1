public class ZoomLesson extends OnlineLesson
{
  private String link;
  private boolean breakOutRooms;

  public ZoomLesson(String topic, Date date, Time start, Time end, Resource[] res, boolean camera, String link, boolean breakout)
  {
    super(topic, date, start, end, res, camera);
    this.link = link;
    breakOutRooms = breakout;
  }

  public String getLink()
  {
    return link;
  }

  public boolean usesBreakOutRooms()
  {
    return breakOutRooms;
  }

  public String nameOfSoftware()
  {
    return "Zoom";
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ZoomLesson))
      return false;
    ZoomLesson other = (ZoomLesson) obj;
    return super.equals(other) && link.equals(other.link) && breakOutRooms == other.breakOutRooms;
  }

  public String toString()
  {
    String temp = super.toString() + "\nSoftware: " + nameOfSoftware() + "\nLink: " + link;
    if (breakOutRooms)
      temp += "\nBreakout rooms are used.";
    return temp;
  }
}
