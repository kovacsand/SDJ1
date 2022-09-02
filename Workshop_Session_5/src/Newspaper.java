public class Newspaper extends Item
{
  private int week;

  public Newspaper(double price, int week)
  {
    super(price);
    this.week = week;
  }

  public int getWeek()
  {
    return week;
  }

  public String toString()
  {
    return String.format("This newspaper was for week %d.\n%s", week, super.toString());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Newspaper))
      return false;
    Newspaper other = (Newspaper) obj;
    return super.equals(other) && week == other.week;
  }

  public String getType()
  {
    return "Newspaper";
  }

  public Item copy()
  {
    return new Newspaper(this.getPrice(), this.week);
  }
}
