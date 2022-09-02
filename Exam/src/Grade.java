public class Grade
{
  private int grade;
  private Course course;

  public Grade(int grade, Course course)
  {
    this.grade = grade;
    this.course = course;
  }

  public int getGrade()
  {
    return grade;
  }

  public Course getCourse()
  {
    return course;
  }

  public Grade copy()
  {
    return new Grade(grade, course);
  }

  public String toString()
  {
    return String.format("Grade: %d, Course: %s", grade, course.getName());
  }
}
