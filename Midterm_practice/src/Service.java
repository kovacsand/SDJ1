public class Service
{
  private int mileage;
          Date date;

  public Service(int mileage, Date date)
  {
    this.mileage = mileage;
    this.date = date;
  }

  public int getMileage()
  {
    return this.mileage;
  }

  public Date getDate()
  {
    return this.date;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof Service)
    {
      Service other = (Service) obj;
      return (other.getMileage() == mileage && other.getDate().equals(date));
    }
    return false;
  }

  public String toString()
  {
    return String.format("This is the mileage: %d, and this is the date: %s", mileage, date);
  }
}
