public class GradeTester
{
  public static void main(String[] args)
  {
    GradeList myGrades = new GradeList(5);
    System.out.println(myGrades.getNumberOfGrades());
    myGrades.setGrade(-3, 0);
    myGrades.setGrade(2, 1);
    myGrades.setGrade(10, 2);
    myGrades.setGrade(7, 3);
    System.out.println(myGrades.getGrade(2));
    System.out.println(myGrades.getAverage());
    System.out.println(myGrades);
  }
}
