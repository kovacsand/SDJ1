public class OfflineLesson extends Lesson
{
  private String classroom;

  public OfflineLesson(String topic, Date date, Time start, Time end, Resource[] res, String classroom)
  {
    super(topic, date, start, end, res);
    this.classroom = classroom;
  }

  public String getClassroom()
  {
    return classroom;
  }

  public void setClassroom(String classroom)
  {
    this.classroom = classroom;
  }

  public String toString()
  {
    return super.toString() + "\nClassroom: " + classroom;
  }
}
