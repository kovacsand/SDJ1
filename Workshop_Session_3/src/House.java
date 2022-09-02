public class House
{
  private Address address;
          double size;


  public House(Address address, double size)
  {
    this.address = address;
    this.size = size;
  }

  public Address getAddress()
  {
    return address;
  }

  public double getSize()
  {
    return size;
  }
}
