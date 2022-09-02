public class PersonTest
{
  public static void main(String[] args)
  {
    Name name1 = new Name("John", "McCanny");
    Name name2 = new Name("Mary", "Colic");
    Person person1 = new Person(name1, 'M');
    Person person2 = new Person(name2, 'F');

    System.out.println(person1);
    System.out.println(person2);
  }
}
