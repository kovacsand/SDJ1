public class ExchangeStudent extends Student
{
  private int intProjectGroup;

  public ExchangeStudent(String name, String addr, int studentNo, int group)
  {
    super(name, addr, studentNo);
    intProjectGroup = group;
  }

  public int getProjectGroup()
  {
    return intProjectGroup;
  }

  public void setProjectGroup(int group)
  {
    this.intProjectGroup = group;
  }

  public String toString()
  {
    return String.format("They are an exchange student in the %d. international project group.\n%s", intProjectGroup, super.toString());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ExchangeStudent))
      return false;
    ExchangeStudent other = (ExchangeStudent) obj;
    return super.equals(other) && intProjectGroup == other.intProjectGroup;
  }
}
