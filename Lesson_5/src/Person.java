public class Person
{
  private String name, birthday;

  public Person()
  {
    name = "No name provided!";
    birthday = "No birthday provided!";
  }

  public Person(String name, String birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  public void setName(String n)
  {
    name = n;
  }
  public void setBirthday(String date)
  {
    birthday = date;
  }
  public String getName()
  {
    return name;
  }
  public String getBirthday()
  {
    return birthday;
  }

  public String toString()
  {
    return name + " was born on " + birthday + ".";
  }

}