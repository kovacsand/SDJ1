public class Address
{
  private String streetName;
          int number;
          String city;
          int zip;

  public Address(String streetName, int number, String city, int zip)
  {
    this.streetName = streetName;
    this.number = number;
    this.city = city;
    this.zip = zip;
  }

  public String getStreetName()
  {
    return streetName;
  }

  public int getNumber()
  {
    return number;
  }

  public String getStreet()
  {
    return streetName + ", " + number;
  }

  public String getCity()
  {
    return city;
  }

  public int getZip()
  {
    return zip;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Address)
    {
      Address other = (Address) obj;
      return streetName.equals(other.streetName) && number == other.number && city.equals(other.city) && zip == other.zip;
    }
    return false;
  }

  public Address copy()
  {
    return new Address(streetName, number, city, zip);
  }

  public String toString()
  {
    return String.format("\n%s, %s\n%s, %s", streetName, number, city, zip);
  }
}
