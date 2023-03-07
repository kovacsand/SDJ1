import java.util.Date;
import java.util.Scanner;

public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate firstDate = new MyDate(20, 9, 2021), secondDate = new MyDate();

    secondDate.setDay(9);
    secondDate.setMonth(12);
    secondDate.setYear(2002);


    /*
    System.out.println(firstDate);
    System.out.println(firstDate.isLeapYear());
    System.out.println(secondDate.displayDate());
    System.out.println(firstDate.getAstroSign());
    System.out.println(secondDate.dayOfWeek());
    System.out.println(firstDate.getMonthName());
     */

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a start year!");
    int start = keyboard.nextInt();
    System.out.println("Enter an end year!");
    int end = keyboard.nextInt();

    int counter = 0;
    for (int i = start; i <= end; i++)
    {
      MyDate date = new MyDate(1, 1, i);
      if (date.isLeapYear())
        counter++;
    }
    System.out.println(counter);

    int daysPassed = 0;
    while (secondDate.getYear() != firstDate.getYear() || secondDate.getMonth() != firstDate.getMonth() || secondDate.getDay() != firstDate.getDay())
    {
      secondDate.nextDay();
      daysPassed++;
    }
    System.out.println(daysPassed);

    MyDate date3 = secondDate.copy();

    System.out.println(date3.equals(secondDate));
    System.out.println(date3);
    date3.nextDays(1);
    System.out.println(date3);
    System.out.println(MyDate.today());

    secondDate.nextDays(3);
    System.out.println(date3.isBefore(secondDate));

  }
}
