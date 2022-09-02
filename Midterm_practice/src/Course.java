import java.util.ArrayList;

public class Course
{
  private String title;
          Instructor primaryInstructor, secondaryInstructor;
          ArrayList<Student> students = new ArrayList<Student>();

  public Course(String title, Instructor primaryInstructor)
  {
    this.title = title;
    this.primaryInstructor = primaryInstructor;
    this.secondaryInstructor =  null;
  }

  public String getTitle()
  {
    return title;
  }

  public Instructor getPrimaryInstructor()
  {
    return primaryInstructor;
  }

  public Instructor getSecondaryInstructor()
  {
    return secondaryInstructor;
  }

  public void setSecondaryInstructor(Instructor secondaryInstructor)
  {
    this.secondaryInstructor = secondaryInstructor;
  }

  public void addStudent(Student student)
  {
    students.add(student);
  }

  public int getNumberOfInstructors()
  {
    int counter = 0;
    if (primaryInstructor != null)
      counter++;
    if (secondaryInstructor != null)
      counter++;
    return counter;
  }

  public int getNumberOfStudents(int semester)
  {
    int counter = 0;
    for (int i = 0; i < students.size(); i++)
      if (students.get(i).semester == semester)
        counter++;
    return counter;
  }

  public Student[] getStudentsBySemester(int semester)
  {
    int counter = 0;
    Student[] temp = new Student[getNumberOfStudents(semester)];
    for (int i = 0; i < students.size(); i++)
      if (students.get(i).semester == semester)
        temp[counter++] = students.get(i);
    return temp;
  }

  public boolean hasStudent(String name)
  {
    for (int i = 0; i < students.size(); i++)
      if (students.get(i).getName().equals(name))
        return true;
    return false;
  }

  public String toString()
  {
    String str = title + "\n" + "The primary instructor is: " + primaryInstructor;
    if (getNumberOfInstructors() == 2)
      str += "The secondary instructor is: " + secondaryInstructor;
    for (int i = 0; i < students.size(); i++)
      str += students.get(i);
    return str;
  }
}
