public class Payroll
{
  private String employeeName;
  private double payRate, hoursWorked;

  public Payroll()
  {
    employeeName = "No name provided!";
    payRate = -1;
    hoursWorked = -1;
  }

  public Payroll(String employeeName, double payRate, double hoursWorked)
  {
    this.employeeName = employeeName;
    this.payRate = payRate;
    this.hoursWorked = hoursWorked;
  }

  public void setEmployeeName(String name)
  {
    employeeName = name;
  }
  public void setPayRate(double wage)
  {
    payRate = wage;
  }
  public void setHoursWorked(double h)
  {
    hoursWorked = h;
  }
  public String getEmployeeName()
  {
    return employeeName;
  }
  public double getPayRate()
  {
    return payRate;
  }
  public double getHoursWorked()
  {
    return hoursWorked;
  }
  public double displayGrossRate()
  {
    return getPayRate() * getHoursWorked();
  }

  public String toString()
  {
    return employeeName + " is working " + hoursWorked
        + " hours and has an hourly rate of " + payRate
        + " DKK. Their gross pay is: " + hoursWorked * payRate;
  }
}
