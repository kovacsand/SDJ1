public class HourlyEmployee extends  Employee
{
  private double wagePerHour, hoursWorkedPerWeek;

  public HourlyEmployee(String name, Date birthday, double wagePerHour, double hoursWorkedPerWeek)
  {
    super(name, birthday);
    this.wagePerHour = wagePerHour;
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public void setWagePerHour(double wagePerHour)
  {
    this.wagePerHour = wagePerHour;
  }

  public double getWagePerHour()
  {
    return wagePerHour;
  }

  public void setHoursWorkedPerWeek(double hoursWorkedPerWeek)
  {
    this.hoursWorkedPerWeek = hoursWorkedPerWeek;
  }

  public double getHoursWorkedPerWeek()
  {
    return hoursWorkedPerWeek;
  }

  public double earningsPerWeek()
  {
    return wagePerHour * hoursWorkedPerWeek;
  }

  public String toString()
  {
    return String.format("%sThey are earning %f per week.\n", super.toString(), earningsPerWeek());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof HourlyEmployee))
      return false;
    HourlyEmployee other = (HourlyEmployee) obj;
    return super.equals(other) && wagePerHour == other.wagePerHour && hoursWorkedPerWeek == other.hoursWorkedPerWeek;
  }
}
