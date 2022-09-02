public class Employee extends Person
{
  private double hours,
                 payRate;

  public Employee(String name, String addr, double hours, double rate)
  {
    super(name, addr);
    this.hours = hours;
    payRate = rate;
  }

  public double getHours()
  {
    return hours;
  }

  public void setHours(double hours)
  {
    this.hours = hours;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public void setPayRate(double payRate)
  {
    this.payRate = payRate;
  }

  public double getSalary()
  {
    return hours*payRate;
  }

  public String toString()
  {
    return String.format("%sThey are an employee, working %f hours. Their pay rate is: %f\nTheir salary is: %f\n", super.toString(), hours, payRate, getSalary());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Employee))
      return false;
    Employee other = (Employee) obj;
    return super.equals(other) && hours == other.hours && payRate == other.payRate;
  }
}
