public class DriverExamTest
{
  public static void main(String[] args)
  {
    DriverExam driverExam = new DriverExam();

    if (driverExam.passed())
      System.out.println("PASSED");
    else
      System.out.println("FAILED");

    System.out.printf("Correct answers: %d\n", driverExam.totalCorrect());
    System.out.printf("Incorrect answers: %d\n", driverExam.totalIncorrect());

    for (int i = 0; i < driverExam.questionsMissed().length; i++)
    {
      if (driverExam.questionsMissed()[i] != 0)
        System.out.println(driverExam.questionsMissed()[i]);
    }
  }
}
