import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the first number");
    double x = keyboard.nextDouble();
    System.out.println("Please enter the second number");
    double y = keyboard.nextDouble();
    System.out.println("Please enter the operator (+,-,*,/)");
    keyboard.nextLine();
    String operator = keyboard.nextLine();
    double result = 0;
    char op = operator.charAt(0);

    if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
      System.out.println("OPERATOR NOT SUPPORTED");
    }
    else
    {
      switch (op)
      {
        case '+':
          result = x+y;
          System.out.printf("%f%s%f=%f", x, operator, y, result);
          break;
        case '-':
          result = x-y;
          System.out.printf("%f%s%f=%f", x, operator, y, result);
          break;
        case '*':
          result = x*y;
          System.out.printf("%f%s%f=%f", x, operator, y, result);
          break;
        case '/':
          if (y == 0)
          {
            System.out.println("Math ERROR");
          }
          else
          {
            DecimalFormat formatter = new DecimalFormat("#.####");
            result = x / y;
            System.out.printf("%f%s%f=%s", x, operator, y, formatter.format(result));
          }
          break;
      }
    }
  }
}
