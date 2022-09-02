public class ApartmentTest
{
  public static void main(String[] args)
  {
    Tenant tenant1 = new Tenant("John", "123456");
    Apartment apartment1 = new Apartment("Copenhagen", 8000);

    System.out.print(apartment1);
    apartment1.rentTo(tenant1.getName(), tenant1.getPhone());

    System.out.println(apartment1.isOccupied());
    apartment1.chargeRent();
    apartment1.chargeRent();
    apartment1.collectRent(10000);

    System.out.println(apartment1);


  }
}
