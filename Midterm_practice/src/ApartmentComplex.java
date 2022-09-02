import java.util.ArrayList;

public class ApartmentComplex
{
  private String address;
          ArrayList<Apartment> apartments = new ArrayList<Apartment>();

  public ApartmentComplex(String address)
  {
    this.address = address;
  }

  public int getNumberOfApartments()
  {
    return apartments.size();
  }

  public void add(Apartment apartment)
  {
    apartments.add(apartment);
  }

  public Apartment getApartment(int index)
  {
    return apartments.get(index);
  }

  public Apartment getApartmentByNumber(int number)
  {
    for (int i = 0; i < apartments.size(); i++)
      if (apartments.get(i).getNumber() == number)
        return apartments.get(i);
    return null;
  }

  public Apartment getApartmentByTenant(Tenant tenant)
  {
    for (int i = 0; i < apartments.size(); i++)
      if (!apartments.get(i).isAvailable() && apartments.get(i).getTenant().equals(tenant))
        return apartments.get(i);
    return null;
  }

  public Apartment getFirstAvailableApartment()
  {
    for (int i = 0; i < apartments.size(); i++)
      if (apartments.get(i).isAvailable())
        return apartments.get(i);
    return null;
  }

  public String toString()
  {
    String str = "The address of the complex: " + address + "\n";
    for (int i = 0; i < apartments.size(); i++)
      str += apartments.get(i).toString();
    return str;
  }
}
