public class Doctor extends HealthCarePersonnel
{
  private String speciality;

  public Doctor(String name, double sal, String title, String speciality)
  {
    super(name, sal, title);
    this.speciality = speciality;
  }

  public void takeCareOfPatient()
  {
    System.out.printf("%s is treating the patient.\n", getName());
  }
}
