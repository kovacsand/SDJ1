public class GradeList
{
  private int[] grades;

  public GradeList(int numberOfGrades)
  {
    grades = new int[numberOfGrades];
    for (int i = 0; i < grades.length; i++)
    {
      grades[i] = -1;
    }
  }

  public int getNumberOfGrades()
  {
    int counter = 0;
    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] != -1)
        counter++;
    }
    return counter;
  }

  public int getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(int grade, int index)
  {
    grades[index] = grade;

  }

  public double getAverage()
  {
    int total = 0;
    for (int i = 0; i < grades.length; i++)
    {
      total += grades[i];
    }
    return (double) total / getNumberOfGrades();
  }

  public String toString()
  {
    return "Your grades are shit.";
  }
}