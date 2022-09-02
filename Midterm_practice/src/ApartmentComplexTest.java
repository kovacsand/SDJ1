public class ApartmentComplexTest
{
  public static void main(String[] args)
  {
    Apartment apartment1 = new Apartment(201);
    apartment1.rentTo(new Tenant("John"), new MyDate(24, 10, 2021));
    ApartmentComplex apartmentComplex1 = new ApartmentComplex("221B Baker Street");
    apartmentComplex1.add(apartment1);
    apartmentComplex1.add(new Apartment(202));
    System.out.println(apartmentComplex1.getFirstAvailableApartment());
  }
}
