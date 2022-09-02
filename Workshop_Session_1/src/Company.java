public class Company
{
  //FIELDS
  private String name,
                 address;
  private Website website;

  //METHODS

  //One-argument constructor
  public Company(String name, String address)
  {
    this.name = name;
    this.address = address;
    this.website = null;
  }

  public void createWebsite(Website website)
  {
    this.website = website;
  }

  //GETTERS
  public URL getURL()
  {
    return website.getURL();
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  //toString
  public String toString()
  {
    if (website != null)
    {
      return String.format("%sIt is owned by %s, whose address is: %s.\n",
          website.toString(), getName(), getAddress());
    }
    else
    {
      return String.format("%s, whose address is: %s, doesn't own a website.\n", getName(), getAddress());
    }
  }
}
