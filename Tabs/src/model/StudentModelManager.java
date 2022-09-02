package model;

import utils.MyFileHandler;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentModelManager
{
  private String fileName;

   public StudentModelManager(String fileName)
   {
      this.fileName = fileName;
   }
 
   // Use the utils.MyFileHandler class to retrieve a model.StudentList object with all Students
   public StudentList getAllStudents()
   {
      StudentList allStudents = new StudentList();

      try
      {
         allStudents = (StudentList)MyFileHandler.readFromBinaryFile(fileName);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error reading file");
      }
      catch (ClassNotFoundException e)
      {
         System.out.println("Class Not Found");
      }
      return allStudents;
   }

   // Return a model.StudentList object with all Students from the given country
   public StudentList getStudentsFrom(String fromCountry)
   {
      StudentList studentsFromCountry = new StudentList();
      StudentList allStudents = getAllStudents();

      for(int i = 0; i < allStudents.size(); i++)
      {
        if(allStudents.get(i).getCountry().equals(fromCountry))
        {
          studentsFromCountry.add(allStudents.get(i));
        }
      }

      return studentsFromCountry;
   }

   // Use the utils.MyFileHandler class to save all Students in the model.StudentList object
   public void saveStudents(StudentList students)
   {
      try
      {
         MyFileHandler.writeToBinaryFile(fileName, students);
      }
      catch (FileNotFoundException e)
      {
         System.out.println("File not found");
      }
      catch (IOException e)
      {
         System.out.println("IO Error writing to file");
      }
   }
 
   // Change the country of the model.Student with the given firstname and lastname
   public void changeCountry(String firstName, String lastName, String country)
   {
      StudentList allStudents = getAllStudents();

      for (int i = 0; i < allStudents.size(); i++)
      {
         Student student = allStudents.get(i);

         if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName))
         {
            student.setCountry(country);
         }
      }

      saveStudents(allStudents);
   }

   // Add more methods to the model manager depending on what you wish to do
}
