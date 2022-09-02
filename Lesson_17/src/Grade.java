public class Grade
{
  private String courseName;
          int grade;

  public Grade(String courseName, int grade)
  {
    this.courseName = courseName;
    this.grade = grade;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  public String toString()
  {
    return String.format("You received a %d in %s.\n", grade, courseName);
  }
}
