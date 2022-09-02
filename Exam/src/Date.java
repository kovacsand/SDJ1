import java.util.GregorianCalendar;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean isBefore(Date date2)
  {
    if (year < date2.year)
      return true;
    if (year == date2.year && month < date2.month)
      return true;
    else if (year == date2.year && month == date2.month && day < date2.day)
      return true;
    return false;
  }

  private boolean isLeapYear()
  {
    if (year % 4 == 0)
      if (year % 100 == 0 && year % 400 != 0)
        return false;
      else
        return true;
    return false;
  }

  private int daysInMonth()
  {
    if (month == 2)
      if (isLeapYear())
        return 29;
      else
        return 28;
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
      return 31;
    else
      return 30;
  }

  private void nextDay()
  {
    day++;
    if (day > daysInMonth())
    {
      day -= daysInMonth();
      month++;
      if (month > 12)
      {
        year++;
        month = 1;
      }
    }
  }

  public int numberOfDaysUntil(Date date2)
  {
    if (!isBefore(date2))
      return -1;
    int counter = 0;
    Date temp = copy();
    while (!temp.equals(date2))
    {
      temp.nextDay();
      counter++;
    }
    return counter;
  }

  public static Date today()
  {
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentDay = currentDate.get(GregorianCalendar.DATE);
    int currentMonth = currentDate.get(GregorianCalendar.MONTH)+1;
    int currentYear = currentDate.get(GregorianCalendar.YEAR);

    return new Date(currentDay, currentMonth, currentYear);
  }

  public Date copy()
  {
    return new Date(day, month, year);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
      return false;
    Date other = (Date) obj;
    return (day == other.day && month == other.month && year == other.year);
  }

  public String toString()
  {
    return String.format("%02d/%02d/%04d", day, month, year);
  }
}
