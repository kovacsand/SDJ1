public class Company
{
  private String name;
          Name ownersName;
          int employees;
          Address address;

  public Company(String name, Name ownersName, int employees)
  {
    this.name = name;
    this.ownersName = ownersName;
    this.employees = employees;
    this.address = null;
  }

  public Company(String name, Name ownersName, int employees, Address address)
  {
    this.name = name;
    this.ownersName = ownersName;
    this.employees = employees;
    this.address = address;
  }

  public String getName()
  {
    return name;
  }

  public Name getOwnersName()
  {
    return ownersName;
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }

  public Address getAddress()
  {
    return address;
  }

  public void setEmployees(int employees)
  {
    this.employees = employees;
  }

  public int getEmployees()
  {
    return employees;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Company)
    {
      Company other = (Company) obj;
      if (name.equals(other.name) && ownersName.equals(other.ownersName) && employees == other.employees)
      {
        if (address == null && other.address == null)
          return true;
        else if (address != null && other.address != null)
        {
          return address.equals(other.address);
        }
      }
    }
    return false;
  }

  public String toString()
  {
    String str = "";
    str += String.format("%s is owned by %s, and has %d employees.\n", name, ownersName.getFullName(), employees);
    if (address != null)
      str += address + "\n";
    return str;
  }
}
