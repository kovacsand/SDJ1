public class Address
{
  private String street,
                 number,
                 postalCode,
                 city,
                 country;

  public Address(String st, String no, String pc, String ci, String co)
  {
    street = st;
    number = no;
    postalCode = pc;
    city = ci;
    country = co;
  }

  public void setAddress(String st, String no, String pc, String ci, String co)
  {
    street = st;
    number = no;
    postalCode = pc;
    city = ci;
    country = co;
  }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getNumber()
  {
    return number;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String toString()
  {
    return String.format("\n%s, %s\n%s, %s\n%s", street, number, city, postalCode, country);
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Address)
    {
      Address other = (Address) obj;

      return (other.street.equals(street) && other.number.equals(number) && other.postalCode.equals(postalCode) && other.city.equals(city) && other.country.equals(country));
    }
    else
    {
      return false;
    }
  }
}
