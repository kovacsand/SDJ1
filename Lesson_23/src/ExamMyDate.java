public class ExamMyDate
{
  private int day, month, year;

  public ExamMyDate(int day, int month, int year)
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

  public ExamMyDate copy()
  {
    return new ExamMyDate(day, month, year);
  }

  public String toString()
  {
    return String.format("%d/%d/%d\n", day, month, year);
  }
}
