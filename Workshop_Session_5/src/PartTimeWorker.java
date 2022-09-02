public class PartTimeWorker extends Employee
{
  private int weeklyHours;

  public PartTimeWorker(String name, double salary, int weeklyHours)
  {
    super(name, salary);
    this.weeklyHours = weeklyHours;
  }

  public int getWeeklyHours()
  {
    return weeklyHours;
  }

  public String toString()
  {
    return String.format("%sThey are working %d hours per week.\n", super.toString(), weeklyHours);
  }
}
