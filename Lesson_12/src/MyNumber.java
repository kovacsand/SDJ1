public class MyNumber
{
  private int number;

  public MyNumber(int number)
  {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }

  public int getLastDigit()
  {
    return Math.abs(number % 10);
  }

  public int getFirstDigit()
  {
    int firstDigit = number;
    while (Math.abs(firstDigit) > 9)
    {
      firstDigit /= 10;
    }
    return Math.abs(firstDigit);
  }

  public boolean isDivisibleBy(int another)
  {
    if (number % another == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public int numberOfProperDivisors()
  {
    int counter = 0;
    for (int i = 1; i < number; i++)
    {
      if (isDivisibleBy(i))
      {
        counter++;
      }
    }
    return counter;
  }

  public boolean isPrime()
  {
    if (numberOfProperDivisors() == 1)
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
    String str = String.format("%d", number);
    if (isPrime())
    {
      str += String.format(" (a prime number)");
    }
    return str;
  }

  public MyNumber plus(MyNumber anotherNumber)
  {
    if (anotherNumber == null)
    {
      anotherNumber = new MyNumber(0);
    }
    return new MyNumber(number + anotherNumber.number);
  }

  public boolean isPerfectNumber()
  {
    int sum = 0;
    for (int i = 1; i < number; i++)
    {
      if (isDivisibleBy(i))
      {
        sum += i;
      }
    }
    if (sum == number)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
