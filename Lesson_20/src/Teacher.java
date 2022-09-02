import java.util.ArrayList;

public class Teacher extends Employee
{
  private ArrayList<String> courses;

  public Teacher(String name, String addr, double hours, double rate)
  {
    super(name, addr, hours, rate);
    courses = new ArrayList<String>();
  }

  public void addCourse(String course)
  {
    courses.add(course);
  }

  public String getCourse(int index)
  {
    return courses.get(index);
  }

  public String[] getAllCourses()
  {
    return courses.toArray(new String[courses.size()]);
  }

  public String toString()
  {
    String str = String.format("%sThey are a teacher.\nThese are their courses:\n", super.toString());
    for (int i = 0; i < courses.size(); i++)
      str += String.format("%d.: %s\n", (i+1), courses.get(i));
    return str;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Teacher))
      return false;
    Teacher other = (Teacher) obj;
    return super.equals(other) && courses.equals(other.courses);
  }
}
