public abstract class Employee
{
  private String name;
  private double salary;

  public Employee(String name, double sal)
  {
    this.name = name;
    salary = sal;
  }

  public String getName()
  {
    return name;
  }
}
