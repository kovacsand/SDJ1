import java.util.ArrayList;

public class Course
{
  private String name;
  private ArrayList<Lesson> schedule;

  public Course(String name)
  {
    this.name = name;
    schedule = new ArrayList<>();
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfLessons()
  {
    return schedule.size();
  }

  public void addLesson(Lesson lesson)
  {
    schedule.add(lesson);
  }

  public void removeLesson(Lesson lesson)
  {
    schedule.remove(lesson);
  }

  public boolean hasLessonOnDate(Date date)
  {
    for (int i = 0; i < getNumberOfLessons(); i++)
    {
      if (schedule.get(i).getDate().equals(date))
        return true;
    }
    return false;
  }

  public ArrayList<Lesson> getAllLessons()
  {
    return schedule;
  }

  public ArrayList<String> getAllTopics()
  {
    ArrayList<String> topics = new ArrayList<>();
    for (int i = 0; i < getNumberOfLessons(); i++)
      if (!topics.contains(schedule.get(i).getTopic()))
        topics.add(schedule.get(i).getTopic());
    return topics;
  }

  public ArrayList<OnlineLesson> getOnlineLessons()
  {
    ArrayList<OnlineLesson> onlineLessons = new ArrayList<>();
    for (int i = 0; i < getNumberOfLessons(); i++)
      if (schedule.get(i) instanceof OnlineLesson)
        onlineLessons.add((OnlineLesson) schedule.get(i));
    return onlineLessons;
  }

  public ArrayList<OnlineLesson> getOnlineLessonsWithCameraRequired()
  {
    ArrayList<OnlineLesson> onlineLessonsWithCamera = new ArrayList<>();
    for (int i = 0; i < getNumberOfLessons(); i++)
      if (schedule.get(i) instanceof OnlineLesson && ((OnlineLesson) schedule.get(i)).isCameraRequired())
        onlineLessonsWithCamera.add((OnlineLesson) schedule.get(i));
    return onlineLessonsWithCamera;
  }

  public ArrayList<DiscordLesson> getDiscordLessons()
  {
    ArrayList<DiscordLesson> discordLessons = new ArrayList<>();
    for (int i = 0; i < getNumberOfLessons(); i++)
      if (schedule.get(i) instanceof DiscordLesson)
        discordLessons.add((DiscordLesson) schedule.get(i));
    return discordLessons;
  }

  public ArrayList<ZoomLesson> getZoomLessonsWithBreakoutRooms()
  {
    ArrayList<ZoomLesson> zoomLessonsWithBreakout = new ArrayList<>();
    for (int i = 0; i < getNumberOfLessons(); i++)
      if (schedule.get(i) instanceof ZoomLesson && ((ZoomLesson) schedule.get(i)).usesBreakOutRooms())
        zoomLessonsWithBreakout.add((ZoomLesson) schedule.get(i));
    return zoomLessonsWithBreakout;
  }

  public ArrayList<Resource> getAllResources()
  {
    ArrayList<Resource> resources = new ArrayList<>();
    for (int i = 0; i < getNumberOfLessons(); i++)
      for (int j = 0; j < schedule.get(i).getResources().length; j++)
        if (!resources.contains(schedule.get(i).getResources()[j]))
          resources.add(schedule.get(i).getResources()[j]);
    return resources;
  }

  public String toString()
  {
    String str = name;
    str += "\nThis course has " + getNumberOfLessons() + " lesson(s).";
    str += "\nThese are all the resources being used:";
    ArrayList<Resource> resources = getAllResources();
    for (int i = 0; i < resources.size(); i++)
      str += "\n" + resources.get(i);
    return str;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Course))
      return false;
    Course other = (Course) obj;
    return name.equals(other.name) && schedule.equals(other.schedule);
  }
  
  public boolean hasOfflineLesson()
  {
    for (int i = 0; i < schedule.size(); i++)
      if (schedule.get(i) instanceof OfflineLesson)
        return true;
    return false;
  }
}
