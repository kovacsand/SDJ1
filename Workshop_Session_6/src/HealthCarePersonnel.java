public abstract class HealthCarePersonnel extends Employee
{
  private String title;

  public HealthCarePersonnel(String name, double sal, String title)
  {
    super(name, sal);
    this.title = title;
  }

  public abstract void takeCareOfPatient();
}
