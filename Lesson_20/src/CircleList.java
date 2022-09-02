import java.util.ArrayList;

public class CircleList
{
  private int capacity;
  private ArrayList<Circle> circles;


  public CircleList(int capacity)
  {
    this.capacity = capacity;
    circles = new ArrayList<Circle>(capacity);
  }

  public int getNumberOfCircles()
  {
    return circles.size();
  }

  public  void addCircle(Circle circle)
  {
    if (getNumberOfCircles() < capacity)
      circles.add(circle);
  }

  public Circle getCircle(int index)
  {
    return circles.get(index);
  }

  public double getTotalArea()
  {
    double sum = 0;
    for (int i = 0; i < circles.size(); i++)
      sum += circles.get(i).getArea();
    return sum;
  }

  public double getAverageArea()
  {
    double average = 0;
    for (int i = 0; i < circles.size(); i++)
      average += circles.get(i).getArea();
    return (average / getNumberOfCircles() * 1.0);
  }
}
