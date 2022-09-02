public class Tenant
{
  private String name;
          MyDate rentedFrom;

  public Tenant(String name)
  {
    this.name = name;
    rentedFrom = new MyDate(MyDate.now().getDay(), MyDate.now().getMonth(), MyDate.now().getYear());
  }

  public String getName()
  {
    return name;
  }

  public MyDate getRentedFrom()
  {
    return rentedFrom.copy();
  }

  public void setRentedFrom(MyDate date)
  {
    this.rentedFrom = date.copy();
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Tenant))
      return false;
    Tenant other = (Tenant) obj;
    return (name.equals(other.name) && rentedFrom.equals(other.rentedFrom));
  }

  public String toString()
  {
    return String.format("%s is renting since: %s", name, rentedFrom);
  }
}
