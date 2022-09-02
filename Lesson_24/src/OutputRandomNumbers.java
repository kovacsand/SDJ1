import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

public class OutputRandomNumbers
{
  public static void main(String[] args)
  {
    try
    {
      ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("Lesson_24/randomNumbers.bin"));
      for (int i = 0; i < 40; i++)
      {
        int temp = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
        write.writeInt(temp);
        System.out.println(temp);
      }
      write.close();
    }
    catch(FileNotFoundException e)
    { System.out.println("File not found, or could not be opened");
      System.exit(1);
    }
    catch(IOException e)
    { System.out.println("IO Error writing to file ");
      System.exit(1);
    }
    System.out.println("Done writing");
  }
}
