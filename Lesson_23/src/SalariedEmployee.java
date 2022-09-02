public class SalariedEmployee extends Employee
{
  private double weeklySalary;

  public SalariedEmployee(String name, Date birthday, double weeklySalary)
  {
    super(name, birthday);
    this.weeklySalary = weeklySalary;
  }

  public void setWeeklySalary(double weeklySalary)
  {
    this.weeklySalary = weeklySalary;
  }

  public double getWeeklySalary()
  {
    return weeklySalary;
  }

  public double earningsPerWeek()
  {
    return weeklySalary;
  }

  public String toString()
  {
    return String.format("%sThey are earning %f per week.\n", super.toString(), earningsPerWeek());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof SalariedEmployee))
      return false;
    SalariedEmployee other = (SalariedEmployee) obj;
    return super.equals(other) && weeklySalary == other.weeklySalary;
  }
}
