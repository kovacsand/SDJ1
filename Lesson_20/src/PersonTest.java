public class PersonTest
{
  public static void main(String[] args)
  {
    Teacher teacher1 = new Teacher("Adam", "Horsens", 37, 10);
    teacher1.addCourse("SDJ");
    teacher1.addCourse("DMA");
    System.out.println(teacher1);
    ITSupporter itSupporter1 = new ITSupporter("Bob", "Aarhus", 37, 20, "Software");
    System.out.println(itSupporter1);
    HeadOfDepartment headOfDepartment1 = new HeadOfDepartment("Claire", "Copenhagen", 37, 50, "Principal");
    System.out.println(headOfDepartment1);
    FullDegreeStudent fullDegreeStudent1 = new FullDegreeStudent("David", "Horsens", 123456, 1);
    fullDegreeStudent1.addGrade("12");
    fullDegreeStudent1.addGrade("10");
    System.out.println(fullDegreeStudent1);
    ExchangeStudent exchangeStudent1 = new ExchangeStudent("Eina", "Horsens", 987654, 4);
    exchangeStudent1.addGrade("7");
    System.out.println(exchangeStudent1);
  }
}
