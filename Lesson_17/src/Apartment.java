public class Apartment
{
  private String address;
  private double rent;
  private Tenant tenant;

  public Apartment(String address, double rent)
  {
    this.address = address;
    this.rent = rent;
    this.tenant = null;
  }

  public String getAddress()
  {
    return address;
  }

  public double getRent()
  {
    return rent;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public void rentTo(String name, String phone)
  {
    if (tenant == null)
      tenant = new Tenant(name, phone);
  }

  public void evict()
  {
    tenant = null;
  }

  public boolean isOccupied()
  {
    return (tenant != null);
  }

  public Tenant getTenant()
  {
    if (tenant == null)
      return null;
    return tenant.copy();
  }

  public double getRentDue()
  {
    if (tenant == null)
      return 0;
    return tenant.getRentDue();
  }

  public void chargeRent()
  {
    if (tenant != null)
      tenant.setRentDue(tenant.getRentDue() + rent);
  }

  public void collectRent(double amount)
  {
    if (tenant != null)
      tenant.setRentDue(tenant.getRentDue() - amount);
  }

  public String toString()
  {
    String str = "";
    str += String.format("The address is: %s\nThe rent is: %s\n", address, rent);
    if (tenant == null)
      str += "No tenant\n";
    else
      str += tenant;
    return str;
  }
}
