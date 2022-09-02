import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grades;

  public GradeList()
  {
    grades = new ArrayList<Grade>();
  }

  public int getNumberOfGrades()
  {
    return grades.size();
  }

  public ArrayList<Grade> getAllGrades()
  {
/* only for composition
    ArrayList<Grade> temp = new ArrayList<Grade>(grades.size());
    for (int i = 0; i < grades.size(); i++)
    {
      temp.add(grades.get(i));
    }
*/
    return grades;
  }

  public Grade[] getAllGradesAsArray()
  {
    return grades.toArray(new Grade[grades.size()]);
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
  }

  public double getAverage()
  {
    double sum = 0;
    for (int i = 0; i < grades.size(); i++)
    {
      sum += grades.get(i).getGrade();
    }
    return sum / grades.size();
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < grades.size(); i++)
    {
      str += (grades.get(i));
    }
    str += getAverage() + "\n";
    return str;
  }
}
