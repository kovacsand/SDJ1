import java.util.ArrayList;

public class Kindergarten
{
  private int countTeachers;
          ArrayList<Child> children;

  public Kindergarten()
  {
    countTeachers = 0;
    children = new ArrayList<Child>();
  }

  public void addChild(Child child)
  {
    children.add(child);
  }

  public void removeChild(Child child)
  {
    boolean found = false;
    int i = 0;
    do
    {
      if (children.get(i).equals(child))
      {
        children.remove(i);
        found = true;
      }
      else
        i++;
    } while (!found);
  }

  public void hireTeachers(int count)
  {
    countTeachers += count;
  }

  public void fireTeacher()
  {
    countTeachers--;
  }

  public int countChildren()
  {
    return children.size();
  }

  public int countTeachers()
  {
    return countTeachers;
  }

  public double getAverageChildAge()
  {
    double sum = 0;
    for (int i = 0; i < children.size(); i++)
      sum += children.get(i).getAge();
    return (sum / (double) countChildren());
  }

  public double getNorm()
  {
    return ((double)countChildren() / countTeachers);
  }

  public void celebrateBirthday(String name)
  {
    boolean found = false;
    int i = 0;
    do
    {
      if (children.get(i).getName().equals(name))
      {
        children.get(i).setAge(children.get(i).getAge() + 1);
        found = true;
      }
      else
        i++;
    } while (!found);
  }

  public String toString()
  {
    String str = "Number of teachers: " + countTeachers + "\n";
    str += "Number of children: " + countChildren() + "\n";
    str += "The average age of the children is: " + getAverageChildAge() + "\n";
    str += "The number of children per teacher is: " + getNorm() + "\n";
    for (int i = 0; i < children.size(); i++)
      str += children.get(i);
    return str;
  }
}
