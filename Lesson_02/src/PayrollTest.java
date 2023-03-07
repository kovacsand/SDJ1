import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Payroll firstEmployee = new Payroll(), secondEmployee = new Payroll();

    System.out.println("What's the first person's name?");
    firstEmployee.setEmployeeName(keyboard.nextLine());
    System.out.println("What's the first person's wage?");
    firstEmployee.setPayRate(keyboard.nextDouble());
    System.out.println("How may hours did the first person work?");
    firstEmployee.setHoursWorked(keyboard.nextDouble());

    //weird thing that I have to do
    keyboard.nextLine();

    System.out.println("What's the second person's name?");
    secondEmployee.setEmployeeName(keyboard.nextLine());
    System.out.println("What's the second person's wage?");
    secondEmployee.setPayRate(keyboard.nextDouble());
    System.out.println("How may hours did the second person work?");
    secondEmployee.setHoursWorked(keyboard.nextDouble());

    System.out.println(firstEmployee.getEmployeeName() + " is working " + firstEmployee.getHoursWorked()
        + " hours and has an hourly rate of " + firstEmployee.getPayRate()
        + " DKK. Their gross pay is: "
        + firstEmployee.displayGrossRate());
    System.out.println(secondEmployee);
  }
}
