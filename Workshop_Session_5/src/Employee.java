public class Employee
{
  private String name;
  private double salary;

  public Employee(String name, double salary)
  {
    this.name = name;
    this.salary = salary;
  }

  public String toString()
  {
    return String.format("%s is earning %f.\n", name, salary);
  }
}
