public class Apartment
{
  private int number;
          Tenant tenant;

  public Apartment(int number)
  {
    this.number = number;
    this.tenant = null;
  }

  public int getNumber()
  {
    return number;
  }

  public boolean isAvailable()
  {
    return (tenant == null);
  }

  public void rentTo(Tenant tenant, MyDate rentedFrom)
  {
    this.tenant = tenant;
    tenant.setRentedFrom(rentedFrom);
  }

  public Tenant getTenant()
  {
    return tenant;
  }

  public String toString()
  {
    return String.format("Apartment number: %d. Information about tenant: %s", number, tenant);
  }
}