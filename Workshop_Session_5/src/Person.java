public class Person
{
  private String name, phoneNumber;

  public Person(String name)
  {
    this.name = name;
    this.phoneNumber = "";
  }

  public Person(String name, String phoneNumber)
  {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

  public String toString()
  {
    return String.format("%s, %s.\n", name, phoneNumber);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
      return false;
    Person other = (Person) obj;
    return name.equals(other.name) && phoneNumber.equals(other.phoneNumber);
  }
}
