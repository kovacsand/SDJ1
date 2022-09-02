package model;

public class Owner
{
  private String firstName, lastName;

  public Owner(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String toString()
  {
    return String.format("%s %s", firstName, lastName);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Owner))
      return false;
    Owner other = (Owner) obj;
    return firstName.equals(other.firstName) && lastName.equals(other.lastName);
  }
}
