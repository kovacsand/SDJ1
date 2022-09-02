import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class OpenFile
{
  public static void main(String[] args)
  {
    Scanner read = null;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the name of the file.");
    String fileName = keyboard.nextLine();

    try
    {
      read = new Scanner(new FileInputStream("Lesson_24/" + fileName));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }

    System.out.println("Text in file:");
    while (read.hasNext())
      System.out.println(read.nextLine());
    read.close();
  }
}
