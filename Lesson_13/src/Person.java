public class Person
{
  private String name,
                 address;
  private MyDate birthDay;

  public Person(String name, String address, MyDate birthDay)
  {
    this.name = name;
    this.address = address;
    this.birthDay = new MyDate(birthDay);
  }

  public  Person(String name, MyDate birthDay)
  {
    this.name = name;
    this.address = null;
    this.birthDay = new MyDate(birthDay);
  }

  public Person(MyDate birthDay)
  {
    this.name = null;
    this.address = null;
    this.birthDay = new MyDate(birthDay);
  }

  public String getName()
  {
    return name;
  }

  public String getAddress()
  {
    return address;
  }

  public MyDate getBirthDay()
  {
    return birthDay.copy();
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public int getAge()
  {
    if (MyDate.today().getMonth() >= getBirthDay().getMonth() && MyDate.today().getDay() > getBirthDay().getDay())
    {
      return MyDate.today().getYear() - getBirthDay().getYear();
    }
    else
      return MyDate.today().getYear() - getBirthDay().getYear() -1;
  }

  public String toString()
  {
    String str = "";

    str = String.format("This person was born on %s.", birthDay);

    if (name != null)
    {
      str += String.format("\nThey are named %s.", name);
    }
    if (address != null)
    {
      str += String.format("\nThey live in %s.", address);
    }

    return str;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Person)
    {
      Person other = (Person) obj;
      return other.name.equals(name) && other.address.equals(address) && other.birthDay.equals(birthDay);
    }
    return false;
  }
}
