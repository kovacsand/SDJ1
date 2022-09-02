import java.io.Serializable;

public class Student implements Serializable
{
  private String firstName, lastName, country;

  public Student(String firstName, String lastName, String country)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getCountry()
  {
    return country;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  public String toString()
  {
    return String.format("%s %s is from %s.\n", firstName, lastName, country);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Student))
      return false;
    Student other = (Student) obj;
    return firstName.equals(other.firstName) && lastName.equals(other.lastName) && country.equals(other.country);
  }
}
