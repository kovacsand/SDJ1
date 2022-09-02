import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MakeXML
{
  public static void main(String[] args)
  {
    PrintWriter write = null;
    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student("Bob", "Bobson", "Denmark"));
    list.add(new Student("Jane", "Doe", "England"));
    list.add(new Student("John", "Doe", "USA"));


    try
    {
      write = new PrintWriter(new FileOutputStream("Lesson_24/studentList.xml"));
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }

    System.out.println("Writing data to file");

    write.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

    write.println("<students>");

    for (int i = 0; i < list.size(); i++)
    {
      write.println("<student>");
      write.println("<firstname>" + list.get(i).getFirstName() + "</firstname>");
      write.println("<lastname>" + list.get(i).getLastName() + "</lastname>");
      write.println("<country>" + list.get(i).getCountry() + "</country>");
      write.println("</student>");
    }

    write.println("</students>");

    write.close();
    System.out.println("Done writing"); }
}
