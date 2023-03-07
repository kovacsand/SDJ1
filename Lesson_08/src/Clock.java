import java.text.DecimalFormat;

public class Clock
{
  //FIELDS
  private int hour,
              minute,
              second;
  private boolean timeFormat24;

  //
  //METHODS
  //

  //Three-argument constructor
  public Clock(int h, int m, int s)
  {
    hour = h;
    minute = m;
    second = s;
    timeFormat24 = true;
  }

  //One-argument constructor
  public Clock(int totalTimeInSeconds)
  {
    hour = totalTimeInSeconds / 3600;
    totalTimeInSeconds -= hour*3600;
    minute = totalTimeInSeconds / 60;
    totalTimeInSeconds -= minute*60;
    second = totalTimeInSeconds;
    timeFormat24 = true;
  }

  //SETTERS
  public void set(int h, int m, int s)
  {
    hour = h;
    minute = m;
    second = s;
  }

  public void setTimeFormat24(int hourFormat)
  {
    switch (hourFormat)
    {
      case 12:
        timeFormat24 = false;
        break;
      case 24:
        timeFormat24 = true;
        break;
      default:
        //makes no changes
        break;
    }
  }

  //GETTERS
  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public boolean isTimeFormat24()
  {
    return  timeFormat24;
  }

  public void tic()
  {
    second += 1;
    if (second == 60)
    {
      second -= 60;
      minute += 1;

      if (minute == 60)
      {
        minute -= 60;
        hour += 1;
      }
    }
    isOver24();
  }

  public void isOver24()
  {
    if (hour >= 24)
    {
      hour -= 24;
    }
  }

  public int convertToSeconds()
  {
    return hour*3600 + minute*60 + second;
  }

  public boolean isBefore(Clock time)
  {
    if (hour > time.getHour())
    {
      return false;
    }
    else if (minute > time.getMinute())
    {
      return false;
    }
    else if (second > time.getSecond())
    {
      return false;
    }
    else
    {
      return true;
    }
  }

  public int timeInSecondsTo(Clock time)
  {
    return Math.abs(time.convertToSeconds() - convertToSeconds() );
  }

  public Clock timeTo(Clock time)
  {
    return new Clock(timeInSecondsTo(time));
  }

  public String toString()
  {
    if (isTimeFormat24())
    {
      return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    else
    {
      if (hour > 12)
      {
        hour -= 12;
        return String.format("%02d:%02d:%02d PM", hour, minute, second);
      }
      else
      {
        return String.format("%02d:%02d:%02d AM", hour, minute, second);
      }
    }
  }
}