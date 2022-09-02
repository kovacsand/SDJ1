public class PersonTest
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(1, 1, 2000);
    MyDate date2 = new MyDate(date1);
    MyDate date3 = new MyDate();
    Person person1 = new Person("Adam", "London", date1);
    Person person2 = new Person("John", date2);
    Person person3 = new Person(date3);

    System.out.println(person1.getAge());
    System.out.println(person2);
    System.out.println(person1.equals(person2));
    person2.setName(person1.getName());
    person2.setAddress(person1.getAddress());
    System.out.println(person2);
    System.out.println(person1.equals(person2));
    System.out.println(person3);
  }
}
