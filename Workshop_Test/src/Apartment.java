public class Apartment
{
  //
  //FIELDS
  //
  private double rent;
  private int numberOfRooms;
  private Tenant tenant;

  //
  //METHODS
  //

  //Two-argument-constructor
  public Apartment(double rent, int numberOfRooms)
  {
    this.rent = rent;
    this.numberOfRooms = numberOfRooms;
    this.tenant = null; //indicating that no tenant has rented the apartment
  }

  //One-argument-constructor
  public Apartment(double rent)
  {
    this.rent = rent;
    this.numberOfRooms = 1; //indicating a 1-room apartment
    this.tenant = null; //indicating that no tenant has rented the apartment
  }

  //Getters
  public double getRent()
  {
    return rent;
  }

  public int getNumberOfRooms()
  {
    return numberOfRooms;
  }

  public Tenant getTenant()
  {
    return tenant;
  }

  //Setters
  public void setRent(double rent)
  {
    this.rent = rent;
  }

  //Returns true if the apartment is available, otherwise returns false
  public boolean isAvailable()
  {
    return tenant == null;
  }

  //Setting new tenant, if the apartment is available
  public void rentTo(Tenant tenant)
  {
    if (isAvailable())
    {
      this.tenant = tenant;
    }
    else
    {
      //Nothing should happen
    }
  }

  //Removing tenant
  public void evict()
  {
    this.tenant = null;
  }

  //toString method for String output
  public String toString()
  {
    if (tenant == null)
    {
      //If it has no tenants, this is the output
      return String.format("The rent is %f for this apartment with %d rooms.", rent, numberOfRooms);
    }
    else
    {
      //If it has a tenant, this is the output
      return String.format("The rent is %f for this apartment with %d rooms. The tenant is %s.",
          this.getRent(), this.getNumberOfRooms(), this.getTenant().getName()); //More complicated, just to test the getters
    }
  }
}
