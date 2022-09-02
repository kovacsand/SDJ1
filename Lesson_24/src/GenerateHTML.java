import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GenerateHTML
{
  public static void main(String[] args)
  {
    ArrayList<Student> list = new ArrayList<Student>();
    list.add(new Student("Bob", "Bobson", "Denmark"));
    list.add(new Student("Jane", "Dope", "England"));
    list.add(new Student("John", "Dope", "USA"));

    ArrayList<String> htmlCode = new ArrayList<String>();

    //READING FILE

    Scanner read = null;

    try
    {
      read = new Scanner(new FileInputStream("Lesson_24/template.html"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found, or could not be opened");
      System.exit(1);
    }

    while (read.hasNext())
    {
      htmlCode.add(read.nextLine());
      String line = htmlCode.get(htmlCode.size() - 1);
      if (line.contains("$title"))
        line = line.replace("$title", "Student List");
      if (line.contains("$header"))
        line = line.replace("$header", "Student List");
      if (line.contains("$paragraph1"))
        line = line.replace("$paragraph1", "This is a list of students");
      if (line.contains("$tableHeader1"))
        line = line.replace("$tableHeader1", "Name");
      if (line.contains("$tableHeader2"))
        line = line.replace("$tableHeader2", "Country");
      if (line.contains("$tableData1"))
        for (int i = 0; i < list.size() - 1; i++)
          htmlCode.add(line);
      htmlCode.set(htmlCode.size() - 1, line);
    }

    read.close();

    //EDITING HTML CODE

    int counter = 0;
    for (int i = 0; i < htmlCode.size(); i++)
      if (htmlCode.get(i).contains("$tableData1"))
        htmlCode.set(i, htmlCode.get(i).replace("$tableData1", list.get(counter).getFirstName() + " " + list.get(counter++).getLastName()));

    counter = 0;
    for (int i = 0; i < htmlCode.size(); i++)
      if (htmlCode.get(i).contains("$tableData2"))
        htmlCode.set(i, htmlCode.get(i).replace("$tableData2", list.get(counter++).getCountry()));

    //WRITING FILE

    PrintWriter write = null;

    try
    {
      write = new PrintWriter(new FileOutputStream("Lesson_24/studentList.html"));
    }
    catch (FileNotFoundException e)
    {
      System.err.println("File not found, or could not be opened");
      System.exit(1);
    }

    for (int i = 0; i < htmlCode.size(); i++)
      write.println(htmlCode.get(i));

    write.close();
  }
}
