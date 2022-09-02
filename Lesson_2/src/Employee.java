public class Employee
{
  private String name, department, position;
  private int idNumber;

  public void setName(String n)
  {
    name = n;
  }
  public void setIdNumber(int number)
  {
    idNumber = number;
  }
  public void setDepartment(String dep)
  {
    department = dep;
  }
  public void setPosition(String pos)
  {
    position = pos;
  }
  public String displayData()
  {
    return String.format("%20s%10d%20s%30s\n", name, idNumber, department,
        position);
  }
}
