public class PersonTest
{
  public static void main(String[] args)
  {
    Person firstPerson = new Person("John", "01/02/1999");
    Person secondPerson = new Person();

    secondPerson.setName("Brad");
    secondPerson.setBirthday("02/03/2000");

    System.out.println(firstPerson);
    System.out.println(secondPerson);
  }
}
