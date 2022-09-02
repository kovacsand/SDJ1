public class PersonTest
{
  public static void main(String[] args)
  {
    Name name1 = new Name("John", "Doe");
    Name name2 = new Name("Emily", "Roberts");
    Address address1 = new Address("Main St", 20, "San Francisco", 1400);
    House house1 = new House(address1, 200);
    Person person1 = new Person(name1, 'M', house1);
    Person person2 = new Person(name2, 'F', house1);

    System.out.println(person1);
    System.out.println(person2);

    person1.setName(name2);

    System.out.println(person1.equals(person2));
  }
}
