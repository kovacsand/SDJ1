import java.util.GregorianCalendar;

public class MyDate
{
  private int day, month, year;

  public MyDate()
  {
    GregorianCalendar currentDate = new GregorianCalendar();
    day = currentDate.get(GregorianCalendar.DATE);
    month = currentDate.get(GregorianCalendar.MONTH)+1;
    year = currentDate.get(GregorianCalendar.YEAR);
  }
  public MyDate(int  day, int month, int year)
  {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  public MyDate(MyDate obj)
  {
    day = obj.day;
    month = obj.month;
    year = obj.year;
  }
  public void setDay(int d)
  {
    if (!isLeapYear() && month == 2 && d == 29)
      throw new IllegalDateException("Not leap year, but 29/02.");
    if (d > daysInMonth())
      throw new IllegalDateException("More days in a month than should be.");
    if (d < 1)
      throw new IllegalDateException("Month cannot be smaller than 1.");
    day = d;
  }
  public void setMonth(int m)
  {
    if (m > 12)
      throw new IllegalDateException("Month cannot be greater than 12");
    if (m < 1)
      throw new IllegalDateException("Month cannot be smaller than 1.");
    month = m;
  }
  public void setYear(int y)
  {
    if (y == 0)
      throw new IllegalDateException("Year cannot be 0.");
    year = y;
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
  public String displayDate()
  {
    return day + "/" + month + "/" + year;
  }
  public boolean isLeapYear()
  {
    if(year%4==0)
    {
      if (year%100==0 && !(year%400==0) )
      {
        return false;
      }
      else
      {
        return true;
      }
    }
    else
    {
      return false;
    }
  }

  public int daysInMonth()
  {
    if (month == 2 && isLeapYear())
    {
      return 29;
    }
    else if (month == 2 && !isLeapYear())
    {
      return 28;
    }
    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
    {
      return 31;
    }
    else
    {
      return 30;
    }
  }

  public String getAstroSign()
  {
    //Aries
    if ( month == 3 && day >= 21 || month == 4 && day <= 19)
    {
      return "Aries";
    }
    //Taurus
    else if ( month == 4 && day >= 20 || month == 5 && day <= 20)
    {
      return "Taurus";
    }
    //Gemini
    else if ( month == 5 && day >= 21 || month == 6 && day <= 20)
    {
      return "Gemini";
    }
    //Cancer
    else if ( month == 6 && day >= 21 || month == 7 && day <= 22)
    {
      return "Cancer";
    }
    //Leo
    else if ( month == 7 && day >= 23 || month == 8 && day <= 22)
    {
      return "Leo";
    }
    //Virgo
    else if ( month == 8 && day >= 23 || month == 9 && day <= 22)
    {
      return "Virgo";
    }
    //Libra
    else if ( month == 9 && day >= 23 || month == 10 && day <= 22)
    {
      return "Libra";
    }
    //Scorpio
    else if ( month == 10 && day >= 23 || month == 11 && day <= 21)
    {
      return "Scorpio";
    }
    //Sagittarius
    else if ( month == 11 && day >= 22 || month == 12 && day <= 21)
    {
      return "Sagittarius";
    }
    //Capricorn
    else if ( month == 12 && day >= 22 || month == 1 && day <= 19)
    {
      return "Capricorn";
    }
    //Aquarius
    else if ( month == 1 && day >= 20 || month == 2 && day <= 18)
    {
      return "Aries";
    }
    //Pisces
    else if ( month == 2 && day >= 19 || month == 3 && day <= 20)
    {
      return "Pisces";
    }
    else
    {
      return "You've messed up!";
    }
  }

  public String dayOfWeek()
  {
    int q = day;
    int m = month;
    int k = year;
    if (m <=2 )
    {
      m += 12;
      k -= 1;
    }
    k = k%100;
    int j = k/100;

    int h = (q + ( ( 13*(m+1)) / (5)  ) + k + (k/4) + (j/4) + 5*j) % 7;

    if (h == 0)
    {
      return "Saturday";
    }
    else if (h == 1)
    {
      return "Sunday";
    }
    else if (h == 2)
    {
      return "Monday";
    }
    else if (h == 3)
    {
      return "Tuesday";
    }
    else if (h == 4)
    {
      return "Wednesday";
    }
    else if (h == 5)
    {
      return "Thursday";
    }
    else if (h == 6)
    {
      return "Friday";
    }
    else
    {
      return "You've messed up!";
    }
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Error";
    }
  }

  public void nextDay()
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

  public void nextDays(int days)
  {
    for (int i = 1; i <= days; i++)
    {
      nextDay();
    }
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof MyDate)
    {
      MyDate other = (MyDate) obj;
      return other.day == day && other.month == month && other.year == year;
    }
    else
    {
      return false;
    }
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  public static MyDate today()
  {
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentDay = currentDate.get(GregorianCalendar.DATE);
    int currentMonth = currentDate.get(GregorianCalendar.MONTH)+1;
    int currentYear = currentDate.get(GregorianCalendar.YEAR);

    return new MyDate(currentDay, currentMonth, currentYear);
  }

  public boolean isBefore(MyDate date2)
  {
    if (year <= date2.year && month <= date2.month && day < date2.day)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public String toString()
  {
    return day + "/" + month + "/" + year;
  }
}
