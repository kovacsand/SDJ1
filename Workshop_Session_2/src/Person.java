public class Person
{
  private char gender;
  private Name name;

  public Person(Name name, char gender)
  {
    this.name = name;
    this.gender = gender;
  }

  public void setName(Name name)
  {
    this.name = name;
  }

  public void setName(String firstName, String lastName)
  {
    name.setFirstName(firstName);
    name.setLastName(lastName);
  }

  public Name getName()
  {
    return name;
  }

  public String getFullName()
  {
    return name.getFullName();
  }

  public boolean isFemale()
  {
    if (gender == 'F')
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public String toString()
  {
    if (isFemale())
    {
      return getFullName() + " is a female.\n";
    }
    else
    {
      return getFullName() + " is a male.\n";
    }
  }
}
