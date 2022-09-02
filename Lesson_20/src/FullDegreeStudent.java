public class FullDegreeStudent extends Student
{
  private int semester;

  public FullDegreeStudent(String name, String addr, int studentNo, int sem)
  {
    super(name, addr, studentNo);
    semester = sem;
  }

  public int getSemester()
  {
    return semester;
  }

  public void setSemester(int semester)
  {
    this.semester = semester;
  }

  public String toString()
  {
    return String.format("They are a full degree student in their %d. semester.\n%s", semester, super.toString());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
      return false;
    FullDegreeStudent other = (FullDegreeStudent) obj;
    return super.equals(other) && semester == other.semester;
  }
}