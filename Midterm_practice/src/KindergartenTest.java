public class KindergartenTest
{
  public static void main(String[] args)
  {
    Kindergarten kindergarten = new Kindergarten();
    Child child = new Child("Bob", 4);
    kindergarten.hireTeachers(4);
    kindergarten.addChild(new Child("Adam", 3));
    kindergarten.addChild(child);
    kindergarten.addChild(new Child("Charlie", 3));

    kindergarten.removeChild(child);
    kindergarten.celebrateBirthday("Charlie");

    System.out.println(kindergarten);
  }
}
