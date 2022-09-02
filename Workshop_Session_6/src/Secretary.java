public class Secretary extends Employee
{
  private String office;

  public Secretary(String name, double sal, String office)
  {
    super(name, sal);
    this.office = office;
  }

  public void registerPatient(String name)
  {
    System.out.printf("%s has been registered.\n", name);
  }
}
