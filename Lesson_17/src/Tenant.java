public class Tenant
{
  private String name,
                 phone;
          double rentDue;

  public Tenant(String name, String phone)
  {
    this.name = name;
    this.phone = phone;
    this.rentDue = 0;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setPhone(String phone)
  {
    this.phone = phone;
  }

  public void setRentDue(double rentDue)
  {
    this.rentDue = rentDue;
  }

  public String getName()
  {
    return name;
  }

  public String getPhone()
  {
    return phone;
  }

  public double getRentDue()
  {
    return rentDue;
  }

  public Tenant copy()
  {
    Tenant temp = new Tenant(this.name, this.phone);
    temp.setRentDue(this.rentDue);
    return temp;
  }

  public String toString()
  {
      return String.format("%s (%s) is renting. Rent due: %f\n", name, phone, rentDue);
  }
}
