import java.util.Scanner;

public class TemperatureTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is the temperature in Fahrenheit?");
    Temperature temp = new Temperature(keyboard.nextDouble());

    System.out.println("The temperature is " + temp.getCelsius() + " degrees Celsius, and "
    + temp.getKelvin() + " degrees Kelvin.");
  }
}
