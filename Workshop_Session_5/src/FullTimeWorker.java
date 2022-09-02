public class FullTimeWorker extends Employee
{
  private String department,
                 position;

  public FullTimeWorker(String name, double salary, String department, String position)
  {
    super(name, salary);
    this.department = department;
    this.position = position;
  }

  public String getDepartment()
  {
    return department;
  }

  public String getPosition()
  {
    return position;
  }

  public String toString()
  {
    return String.format("%sThey are working in the %s department, as a %s.\n", super.toString(), department, position);
  }
}
