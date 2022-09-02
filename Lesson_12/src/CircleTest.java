public class CircleTest
{
  public static void main(String[] args)
  {
    Circle circle1 = new Circle(4);
    Circle circle2 = new Circle(3);

    System.out.println(circle2);
    System.out.println(circle1.equals(circle2));
    System.out.println(circle2.greaterThan(circle1));
  }
}
