public class Paramedic extends HealthCarePersonnel
{
  private int ambulanceID;

  public Paramedic(String name, double sal, String title, int ambulanceID)
  {
    super(name, sal, title);
    this.ambulanceID = ambulanceID;
  }

  public void takeCareOfPatient()
  {
    System.out.printf("%s is driving the patient to the hospital.\n", getName());
  }
}
