public class Date
{
  private int day,
              month,
              year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date()
  {
    this.day = 1;
    this.month = 1;
    this.year = 1900;
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public Date copy()
  {
    return new Date(this.day, this.month, this.year);
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Date)
    {
      Date other = (Date) obj;
      return (other.day == day && other.month == month && other.year == year);
    }
    return false;
  }

  public String toString()
  {
    return String.format("%d/%d/%d\n", day, month, year);
  }
}
