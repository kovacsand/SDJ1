public class Time
{
  private int hour;
  private int minute;
  private int second;

  public Time(int h, int m, int s)
  {
    hour = h;
    minute = m;
    second = s;
  }

  public Time(int totalTimeInSeconds)
  {
    hour = totalTimeInSeconds / 3600;
    totalTimeInSeconds %= 3600;
    minute = totalTimeInSeconds / 60;
    totalTimeInSeconds %= 60;
    second = totalTimeInSeconds;
  }

  public int convertToSeconds()
  {
    return hour * 3600 + minute * 60 + second;
  }

  public boolean isBefore(Time time2)
  {
    return (convertToSeconds() < time2.convertToSeconds());
  }

  public Time timeUntil(Time time2)
  {
    if (!isBefore(time2))
      return new Time(time2.convertToSeconds() - convertToSeconds() + 86400);
    return new Time(time2.convertToSeconds() - convertToSeconds());
  }

  public Time copy()
  {
    return new Time(convertToSeconds());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Time))
      return false;
    Time other = (Time) obj;
    return (hour == other.hour && minute == other.minute && second == other.second);
  }

  public String toString()
  {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}
