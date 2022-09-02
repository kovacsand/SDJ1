public class Customer extends Person2
{
  private int customerNumber;
  private boolean onMailingList;

  public Customer(String name, String address, String phoneNumber, int customerNumber)
  {
    super(name, address, phoneNumber);
    this.customerNumber = customerNumber;
    this.onMailingList = false;
  }

  public int getCustomerNumber()
  {
    return customerNumber;
  }

  public void setCustomerNumber(int customerNumber)
  {
    this.customerNumber = customerNumber;
  }

  public boolean isOnMailingList()
  {
    return onMailingList;
  }

  public void setOnMailingList(boolean onMailingList)
  {
    this.onMailingList = onMailingList;
  }
}
