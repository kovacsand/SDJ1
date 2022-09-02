import java.util.ArrayList;

public class Student
{
  private int studentNumber;
  private String name;
  private CoronaPassport coronaPassport;
  private ArrayList<Course> courses;
  private ArrayList<Grade> grades;

  public Student(int studentNumber, String name)
  {
    this.studentNumber = studentNumber;
    this.name = name;
    this.coronaPassport = null;
    this.courses = new ArrayList<>();
    this.grades = new ArrayList<>();
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

  public String getName()
  {
    return name;
  }

  public void addCourse(Course course)
  {
    courses.add(course);
  }

  public void addGrade(Grade grade)
  {
    if (courses.contains(grade.getCourse()))
      grades.add(grade.copy());
  }

  public void addCoronaPassport(CoronaPassport passport)
  {
    this.coronaPassport = passport;
  }

  public void removeCoronaPassport()
  {
    this.coronaPassport = null;
  }

  public CoronaPassport getCoronaPassport()
  {
    return coronaPassport;
  }

  public boolean hasValidCoronaPassport()
  {
    if (coronaPassport == null)
      return false;
    if (!Date.today().isBefore(coronaPassport.getDate()))
    {
      if (coronaPassport.getReason().equals("Vaccinated"))
        return true;
      if (coronaPassport.getReason().equals("Tested") && coronaPassport.getDate().numberOfDaysUntil(Date.today()) <= 3)
        return true;
      if (coronaPassport.getReason().equals("Infected") && coronaPassport.getDate().numberOfDaysUntil(Date.today()) <= 180 && coronaPassport.getDate().numberOfDaysUntil(Date.today()) > 14)
        return true;
    }
    return false;
  }

  public double getGradeAverage()
  {
    double temp = 0;
    for (int i = 0; i < grades.size(); i++)
      temp += grades.get(i).getGrade();
    return temp / grades.size();
  }

  public Grade[] getAllGrades()
  {
    Grade[] temp = new Grade[grades.size()];
    for (int i = 0; i < temp.length; i++)
    {
      temp[i] = grades.get(i).copy();
    }
    return temp;
  }

  public Course[] getAllCourses()
  {
    return courses.toArray(new Course[courses.size()]);
  }

  public ArrayList<SoftwareCourse> getAllSoftwareCourses()
  {
    ArrayList<SoftwareCourse> temp = new ArrayList<>();
    for (int i = 0; i < courses.size(); i++)
      if (courses.get(i) instanceof SoftwareCourse)
        temp.add((SoftwareCourse) courses.get(i));
    return temp;
  }

  public ArrayList<SoftwareCourse> getSoftwareBySemester(int semester)
  {
    ArrayList<SoftwareCourse> temp = new ArrayList<>();
    for (int i = 0; i < courses.size(); i++)
      if (courses.get(i) instanceof SoftwareCourse && ((SoftwareCourse) courses.get(i)).getSemester() == semester)
        temp.add((SoftwareCourse) courses.get(i));
    return temp;
  }
}
