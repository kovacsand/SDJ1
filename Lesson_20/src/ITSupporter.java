public class ITSupporter extends Employee
{
  private String workArea;

  public ITSupporter(String name, String addr, double hours, double rate, String workArea)
  {
    super(name, addr, hours, rate);
    this.workArea = workArea;
  }

  public String getWorkArea()
  {
    return workArea;
  }

  public void setWorkArea(String workArea)
  {
    this.workArea = workArea;
  }

  public String toString()
  {
    return String.format("%sTheir working area is: %s\n", super.toString(), workArea);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof ITSupporter))
      return false;
    ITSupporter other = (ITSupporter) obj;
    return super.equals(other) && workArea.equals(other.workArea);
  }
}
