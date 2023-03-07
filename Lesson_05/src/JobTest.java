public class JobTest
{
  public static void main(String[] args)
  {
    Person tempPerson = new Person("John", "01/01/2000");
    Job job1 = new Job("Teacher", 3500, tempPerson);

    System.out.print(job1);

    job1.setTitle("Cleaner");
    job1.setSalary(99.9);

    System.out.print(job1);

    Job job2 = new Job("Principal", 6200.5);

    System.out.print(job2);

    tempPerson.setName("Mary");
    tempPerson.setBirthday("29/2/1950");

    job2.setEmployee(tempPerson);

    System.out.printf("%s works as a/an %s earning %f.\n", job2.getEmployee().getName(), job2.getTitle(), job2.getSalary());

    job2.givePercentageRaise(50);
    System.out.printf("%s works as a/an %s earning %f.\n", job2.getEmployee().getName(), job2.getTitle(), job2.getSalary());

  }
}
