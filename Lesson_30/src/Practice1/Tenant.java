package Practice1;

public class Tenant
{
  private String name;
  private MyDate rentedFrom;

  public Tenant(String name)
  {
    this.name = name;
    this.rentedFrom = null;
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom()
  {
    return rentedFrom;
  }

  public void setRentedFrom(MyDate rentedFrom)
  {
    this.rentedFrom = rentedFrom;
  }
}
