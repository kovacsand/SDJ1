public class PersonTest
{
  public static void main(String[] args)
  {
    Pet pet1 = new Pet("dog", "Rex");
    Pet pet2 = new Pet("cat", "Fluffy");
    Person person1 = new Person("John");
    Person person2 = new Person("Mary");

    person2.setPet(pet2);

    System.out.println(pet1);
    System.out.println(person1);
    System.out.println(person2);
  }
}
