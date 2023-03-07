public class EmployeeTest
{
  public static void main(String[] args)
  {
    Employee firstPerson = new Employee(), secondPerson = new Employee(), thirdPerson = new Employee();

    firstPerson.setName("Susan Meyers");
    firstPerson.setIdNumber(47899);
    firstPerson.setDepartment("Accounting");
    firstPerson.setPosition("Vice President");

    secondPerson.setName("Mark Jones");
    secondPerson.setIdNumber(39119);
    secondPerson.setDepartment("IT");
    secondPerson.setPosition("Programmer");

    thirdPerson.setName("Joy Rogers");
    thirdPerson.setIdNumber(81774);
    thirdPerson.setDepartment("Manufacturing");
    thirdPerson.setPosition("Engineer");

    System.out.print(firstPerson.displayData());
    System.out.print(secondPerson.displayData());
    System.out.print(thirdPerson.displayData());
  }
}
