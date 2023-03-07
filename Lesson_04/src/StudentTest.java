public class StudentTest
{
  public static void main(String[] args)
  {
    Student firstStudent = new Student("John", 'M');
    Student secondStudent = new Student("Mary", 'F', 123456);
    Student thirdStudent = new Student("Mark", 'M', 111222);

    firstStudent.setName("Peter");
    firstStudent.setStudentNumber(987654);

    System.out.println(firstStudent.getName() + " is a really nice "
        + firstStudent.getGender() + ",and owns the Student number: " + firstStudent.getStudentNumber());
    System.out.println(secondStudent);
    System.out.println(thirdStudent);
  }
}
