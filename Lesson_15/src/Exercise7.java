public class Exercise7
{
  public static void main(String[] args)
  {
    int[] points = {3, 5, 1, 3, 3, 2, 4, 2, 3};

    int total = 0, holeInOneCounter = 0;
    for (int i = 0; i < points.length; i++)
    {
      total += points[i];
      if (points[i] == 1)
        holeInOneCounter++;
    }

    System.out.printf("The total number of hits is: %d\nThe average hits per hole is: %f\nThe number of Hole-in-Ones is: %d",
        total, (double) total / points.length, holeInOneCounter);
  }
}
