public class PersonTest
{
  public static void main(String[] args)
  {
    MyDate date1 = new MyDate(1, 1, 2000);
    MyDate date2 = new MyDate(date1);
    Address address1 = new Address("Bay", "20", "2000" ,"London", "UK");
    Person person1 = new Person("Adam", address1 , date1);
    Person person2 = new Person("John", date2);

    System.out.println(person1.getAge());
    System.out.println(person2);
    System.out.println(person1.equals(person2));
    person2.setName(person1.getName());
    person2.setAddress(person1.getAddress());
    System.out.println(person2);
    System.out.println("They are the same " + person1.equals(person2));


    System.out.println("Testing brain!!");
    person1.rememberThis("apples");
    person1.rememberThis("bananaaaaaas");
    //person1.rememberThis("carrrrrrrot");
    //person1.rememberThis("dates");
    System.out.println(person1.doYouRemember("apples"));
    person1.rememberThis("apples");
    System.out.println(person1);
  }
}
