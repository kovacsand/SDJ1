import java.io.*;
import java.util.Scanner;

public class ReadBinaryFile
{
  public static void main(String[] args)
  {
    ObjectInputStream read = null;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the name of the file.");
    String fileName = keyboard.nextLine();

    try
    {
      read = new ObjectInputStream(new FileInputStream("Lesson_24/" + fileName));
      while(true)
      {
        try
        {
          System.out.println(read.readInt());
        }
        catch (EOFException eof)
        {
          System.out.println("End of file");
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    catch(IOException e)
    { System.out.println("IO Error reading file");
      System.exit(1);
    }
  }
}
