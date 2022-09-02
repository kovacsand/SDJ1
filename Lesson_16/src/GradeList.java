public class GradeList
{
  private Grade[] grades;

  public GradeList(int numberOfGrades)
  {
    grades = new Grade[numberOfGrades];
    for (int i = 0; i < grades.length; i++)
    {
      grades[i] = new Grade("", -1);
    }
  }

  public int getNumberOfGrades()
  {
    int counter = 0;
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i].getGrade() != -1)
        counter++;
    }
    return counter;
  }

  public Grade getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(Grade grade, int index)
  {
    grades[index] = grade;

  }

  public double getAverage()
  {
    if (getNumberOfGrades() == 0)
    {
      return -1;
    }
    int total = 0;
    for (int i = 0; i < grades.length; i++)
    {
      total += grades[i].getGrade();
    }
    return (double) total / getNumberOfGrades();
  }

  public String toString()
  {
    String str = "";
    if (grades.length == 0)
    {
      str += "You have no grades.";
    }
    for (int i = 0; i < grades.length; i++)
    {
      str += grades[i];
    }
    return str;
  }
}