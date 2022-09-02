public class HeadOfDepartment extends Employee
{
  private String department;

  public HeadOfDepartment(String name, String addr, double hours, double rate, String department)
  {
    super(name, addr, hours, rate);
    this.department = department;
  }

  public String getDepartment()
  {
    return department;
  }

  public void setDepartment(String department)
  {
    this.department = department;
  }

  public String toString()
  {
    return String.format("%sTheir department is: %s\n", super.toString(), department);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof HeadOfDepartment))
      return false;
    HeadOfDepartment other = (HeadOfDepartment) obj;
    return super.equals(other) && department.equals(other.department);
  }
}
