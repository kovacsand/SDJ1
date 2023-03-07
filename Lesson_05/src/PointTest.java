public class PointTest
{
  public static void main(String[] args)
  {
    Point pointA = new Point(2,5);
    Point pointB = new Point(6,8);

    System.out.print(pointA);

    pointA.setX(pointA.getX()+1);
    pointA.setY(pointA.getY()-1);

    System.out.print(pointA);
    System.out.print(pointB);

    System.out.println(Math.sqrt (Math.pow (pointB.getX()-pointA.getX(),2) + Math.pow(pointB.getY()-pointA.getY(),2)) );
  }
}
