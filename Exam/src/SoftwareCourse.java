public class SoftwareCourse extends Course
{
  private int semester;

  public SoftwareCourse(String name, int semester)
  {
    super(name);
    this.semester = semester;
  }

  public int getSemester()
  {
    return semester;
  }

  public void setSemester(int semester)
  {
    this.semester = semester;
  }
}
