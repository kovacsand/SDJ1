public abstract class Employee
{
  private String name;
  private Date birthday;

  public Employee(String name, Date birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Date getBirthday()
  {
    return birthday;
  }

  public String toString()
  {
    return String.format("%s was born on %s", name, birthday);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Employee))
      return false;
    Employee other = (Employee) obj;
    return name.equals(other.name) && birthday.equals(other.birthday);
  }

  public abstract double earningsPerWeek();
}
