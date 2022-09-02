public class PreferredCustomer extends Customer
{
  private int amountOfPurchases,
              discountLevel; //discount in percentage

  public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, int amountOfPurchases)
  {
    super(name, address, phoneNumber, customerNumber);
    this.amountOfPurchases = amountOfPurchases;
    discountLevel = 0;
    if (amountOfPurchases >= 500)
      discountLevel = 5;
    if (amountOfPurchases >= 1000)
      discountLevel = 6;
    if (amountOfPurchases >= 1500)
      discountLevel = 7;
    if (amountOfPurchases >= 2000)
      discountLevel = 10;
  }
}
