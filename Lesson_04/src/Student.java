public class Student
{
  private String name;
  private char gender;
  private int studentNumber;

  public Student(String name, char gender, int studentNumber)
  {
    this.name = name;
    this.gender = gender;
    this.studentNumber = studentNumber;
  }
  public Student(String name, char gender)
  {
    this.name = name;
    this.gender = gender;
    studentNumber = 0;
  }

  public void setName(String name)
  {
    this.name = name;
  }
  public void setStudentNumber(int studentNumber)
  {
    this.studentNumber = studentNumber;
  }
  public String getName()
  {
    return name;
  }
  public char getGender()
  {
    return gender;
  }
  public int getStudentNumber()
  {
    return studentNumber;
  }
  public String toString()
  {
    return String.format("%s, '%c',%d", name, gender, studentNumber);
  }
}
