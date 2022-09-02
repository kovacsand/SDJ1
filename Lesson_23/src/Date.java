import java.awt.event.WindowStateListener;

public class Date
{
  private int day, month, year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public Date copy()
  {
    return new Date(day, month, year);
  }

  public String toString()
  {
    return String.format("%d/%d/%d\n", day, month, year);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
      return false;
    Date other = (Date) obj;
    return day == other.day && month == other.month && year == other.year;
  }
}
