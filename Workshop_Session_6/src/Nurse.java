public class Nurse extends HealthCarePersonnel
{
  private String department;

  public Nurse(String name, double sal, String title, String department)
  {
    super(name, sal, title);
    this.department = department;
  }

  public void takeCareOfPatient()
  {
    System.out.printf("%s is nursing the patient.\n", getName());
  }
}
