public class Student
{
  private String name;
          int semester;

  public Student(String name, int semester)
  {
    this.name = name;
    this.semester = semester;
  }

  public String getName()
  {
    return name;
  }

  public int getSemester()
  {
    return semester;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
      return false;
    Student other = (Student) obj;
    return (name.equals(other.name) && semester == other.semester);
  }

  public String toString()
  {
    return String.format("%s is in the %d. semester\n", name, semester);
  }
}
