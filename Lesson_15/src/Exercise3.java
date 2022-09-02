public class Exercise3
{
  public static void main(String[] args)
  {
    int[] sourceArray = {1, 2, 3, 4, 5, 6, 7};
    int[] destinationArray = new int[sourceArray.length*2];
    for (int i = 0; i < sourceArray.length; i++)
    {
      destinationArray[i] = sourceArray[i];
    }
    for (int i = destinationArray.length / 2; i < destinationArray.length; i++)
    {
      destinationArray[i] = 0;
    }
    System.out.println();
    for (int i = 0; i < destinationArray.length; i++)
    {
      System.out.print(destinationArray[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < sourceArray.length; i++)
    {
      System.out.print(sourceArray[i] + " ");
    }
  }
}
