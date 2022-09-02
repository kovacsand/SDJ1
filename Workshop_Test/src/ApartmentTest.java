public class ApartmentTest
{
  public static void main(String[] args)
  {
    //Creating three Apartment-objects
    Apartment firstApartment = new Apartment(300.50, 2);
    Apartment secondApartment = new Apartment(400);
    Apartment thirdApartment = new Apartment(800, 3);

    //Changing the rent of the first apartment
    firstApartment.setRent(450.50);

    //Creating two Tenant-objects
    Tenant firstTenant = new Tenant("Joshua");
    Tenant secondTenant = new Tenant("Mary");

    //Renting the apartments for the tenants
    firstApartment.rentTo(firstTenant);
    secondApartment.rentTo(secondTenant);

    //
    //OUTPUT
    //
    System.out.println(firstApartment);
    System.out.println(secondApartment);
    System.out.println(thirdApartment);
  }
}
