public class Person
{
  private Name name;
          char gender;
          House house;

  public Person(Name name, char gender, House house)
  {
    this.name = name;
    this.gender = gender;
    this.house = house;
  }

  public void setName(Name name)
  {
    this.name = name;
  }

  public void setName(String firstName, String lastName)
  {
    this.name.setFirstName(firstName);
    this.name.setLastName(lastName);
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
    return gender == 'F';
  }

  public String toString()
  {
    String str = "";
    str += String.format("%s is a ", getFullName());
    if (isFemale())
      str += "female. She's living at:\n";
    else
      str += "male. He's living at: \n";
    str += house.getAddress();
    return str;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Person)
    {
      Person other = (Person) obj;
      return name.equals(other.name) && gender == other.gender && house.size == other.house.size && house.getAddress().equals(other.house.getAddress());
    }
    return false;
  }
}