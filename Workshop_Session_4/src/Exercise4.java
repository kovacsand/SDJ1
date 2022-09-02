import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is the column size?");
    int column = keyboard.nextInt();
    System.out.println("What is the row size?");
    int row = keyboard.nextInt();

    int[][] table = new int[row][column];

    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < column; j++)
      {
        table[i][j] = (i+1) * (j+1);
        System.out.print(table[i][j] + " ");
      }
      System.out.println();
    }
  }
}
