public class Instructor
{
  private String name;
          int officeNumber;

  public Instructor(String name, int officeNumber)
  {
    this.name = name;
    this.officeNumber = officeNumber;
  }

  public String getName()
  {
    return name;
  }

  public int getOfficeNumber()
  {
    return officeNumber;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Instructor))
      return false;
    Instructor other = (Instructor) obj;
    return (name.equals(other.name) && officeNumber == other.officeNumber);
  }

  public String toString()
  {
    return String.format("%s can be found in room %d\n", name, officeNumber);
  }
}
