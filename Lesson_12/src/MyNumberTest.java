public class MyNumberTest
{
  public static void main(String[] args)
  {
    MyNumber number1 = new MyNumber(30);
    MyNumber number2 = new MyNumber(28);

    System.out.println(number1.getFirstDigit());
    System.out.println(number1.isDivisibleBy(3));
    System.out.println(number1.numberOfProperDivisors());
    System.out.println(number1);
    System.out.println(number1.plus(null));
    System.out.println(number2.isPerfectNumber());
  }
}
