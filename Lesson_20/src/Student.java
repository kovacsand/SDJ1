import java.util.ArrayList;

public class Student extends Person
{
  private int studentNo;
  private ArrayList<String> grades;

  public Student(String name, String addr, int studentNo)
  {
    super(name, addr);
    this.studentNo = studentNo;
    grades = new ArrayList<String>();
  }

  public int getStudentNo()
  {
    return studentNo;
  }

  public void setStudentNo(int studentNo)
  {
    this.studentNo = studentNo;
  }

  public void addGrade(String grade)
  {
    grades.add(grade);
  }

  public String getGrade(int index)
  {
    return grades.get(index);
  }

  public String[] getAllGrades()
  {
    return grades.toArray(new String[grades.size()]);
  }

  public String toString()
  {
    String str = String.format("%sThey are a student. Their student number is: %s\n", super.toString(), studentNo);
    str += "Their grades are: \n";
    for (int i = 0; i < grades.size(); i++)
      str += String.format("%d.: %s\n", (i+1), grades.get(i));
    return str;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
      return false;
    Student other = (Student) obj;
    return super.equals(other) && studentNo == other.studentNo && grades.equals(other.grades);
  }
}
