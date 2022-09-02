public class CompanyTest
{
  public static void main(String[] args)
  {
    Company company1 = new Company("Apple", new Name("Tim", "Cook"), 2000);
    Address address1 = new Address("Main St", 20, "San Francisco", 1400);
    Company company2 = new Company("Microsoft", new Name("Bill", "Gates"), 2500, address1);
    Company company3 = new Company("Microsoft", new Name("Bill", "Gates"), 2500, address1);

    System.out.println(company1);
    System.out.println(company2);
    System.out.println(company3.equals(company2));
  }
}
