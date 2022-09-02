public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList gradeList = new GradeList(3);
    System.out.println(gradeList.getNumberOfGrades());
    System.out.println(gradeList.getAverage());

    gradeList.setGrade(new Grade("SDJ", 12), 0);
    gradeList.setGrade(new Grade("RWD", 10), 1);
    gradeList.setGrade(new Grade("SEP", 7), 2);

    System.out.println(gradeList);
    System.out.println(gradeList.getNumberOfGrades());
    System.out.println(gradeList.getGrade(1));
    System.out.println(gradeList.getAverage());
  }
}
