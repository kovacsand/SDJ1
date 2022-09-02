public class Person
{
  private String name;
  private Address address;
  private MyDate birthDay;
  private Brain brain;

  public Person(String name, Address address, MyDate birthDay)
  {
    this.name = name;
    this.address = new Address(address.getStreet(), address.getNumber(), address.getPostalCode(), address.getCity(), address.getCountry());
    this.birthDay = new MyDate(birthDay);
    this.brain = new Brain();
  }

  public Person(String name, MyDate birthDay)
  {
    this.name = name;
    this.address = null;
    this.birthDay = new MyDate(birthDay);
    this.brain = new Brain();
  }

  public Person(MyDate birthDay)
  {
    this.name = null;
    this.address = null;
    this.birthDay = new MyDate(birthDay);
    this.brain = new Brain();
  }

  public String getName()
  {
    return name;
  }

  public Address getAddress()
  {
    return address;
  }

  public String getShortAddress()
  {
    return String.format("%s, %s", address.getStreet(), address.getNumber());
  }

  public MyDate getBirthDay()
  {
    return birthDay.copy();
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setAddress(Address address)
  {
    this.address = new Address(address.getStreet(), address.getNumber(), address.getPostalCode(), address.getCity(), address.getCountry());
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

  public int getIQ()
  {
    return brain.getIQ();
  }

  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }

  public void rememberThis(String topic)
  {
    if (!brain.recall(topic))
    {
      brain.remember(topic);
    }
    else
    {
      brain.refreshMemory(topic);
    }
  }

  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
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

    str += brain;

    return str;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Person)
    {
      Person other = (Person) obj;
      return other.name.equals(name) && other.address.equals(address) && other.birthDay.equals(birthDay) && other.brain.equals(brain);
    }
    return false;
  }
}
