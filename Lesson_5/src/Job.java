public class Job
{
  private String title;
  private double salary;
  private Person employee;

  public Job(String title, double salary, Person employee)
  {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }
  public Job(String title, double salary)
  {
    this.title =  title;
    this.salary = salary;
    this.employee = new Person();
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public void setEmployee(Person employee)
  {
    this.employee = employee;
  }

  public String getTitle()
  {
    return title;
  }

  public double getSalary()
  {
    return salary;
  }

  public Person getEmployee()
  {
    return employee;
  }
  public void givePercentageRaise(double percentage)
  {
    salary *= (1+percentage/100);
  }

  public String toString()
  {
    return String.format("%s, who was born on %s works as a/an %s, and earns %f.\n",
        employee.getName(),employee.getBirthday(),title,salary);
  }
}
