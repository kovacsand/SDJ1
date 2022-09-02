import java.util.ArrayList;

public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList gradeList = new GradeList();

    gradeList.addGrade(new Grade("SDJ", 12));
    gradeList.addGrade(new Grade("DMA", 12));
    gradeList.addGrade(new Grade("SEP", 10));

    ArrayList<Grade> gradeList2 = gradeList.getAllGrades();

    System.out.println(gradeList.getNumberOfGrades());
    System.out.println(gradeList);
    System.out.println(gradeList2);

    for (int i = 0; i < gradeList.getAllGradesAsArray().length; i++)
    {
      System.out.print(gradeList.getAllGradesAsArray()[i]);
    }
  }
}
