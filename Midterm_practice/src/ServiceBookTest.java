public class ServiceBookTest
{
  public static void main(String[] args)
  {
    ServiceBook serviceBook1 = new ServiceBook();
    serviceBook1.addService(new Service(1, new Date(23, 10, 2021)));
    serviceBook1.addService(new Service(10, new Date(23, 11, 2021)));

    System.out.println(serviceBook1);
    System.out.println(serviceBook1.getDateOfLastService().toString());
  }
}
