import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Friends
{
  public static void main(String[] args)
  {
    PrintWriter write = null;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("I'm gonna write your friends into a text file. Please enter the name of the file first.");
    String fileName = keyboard.nextLine();

    try
    {
      write = new PrintWriter(new FileOutputStream("Lesson_24/" + fileName));
    }
    catch (FileNotFoundException e)
    {
      System.err.println("File not found, or could not be opened");
      System.exit(1);
    }

    String str;
    do
    {
      System.out.println("Type your friends name, or \"DONE\" if you don't have more.");
      str = keyboard.nextLine();
      if (!str.equals("DONE"))
        write.println(str);
    } while (!str.equals("DONE"));

    write.close();
    System.out.println("Done writing!");
  }
}
