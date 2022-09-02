//DONE IN 18 MINUTES

import java.util.ArrayList;

public class ServiceBook
{
  private ArrayList<Service> services;

  public ServiceBook()
  {
    this.services = new ArrayList<Service>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }

  public int getNumberOfServices()
  {
    return services.size();
  }

  public Service getService(int index)
  {
    return services.get(index);
  }

  public Service[] getAllServices()
  {
    Service[] temp = new Service[services.size()];
    return services.toArray(temp);
  }

  public int[] getAllServiceMileages()
  {
    int[] temp = new int[services.size()];
    for (int i = 0; i < services.size(); i++)
      temp[i] = services.get(i).getMileage();
    return temp;
  }

  public boolean hasServiceOnDate(Date date)
  {
    for (int i = 0; i < services.size(); i++)
      if (services.get(i).getDate().equals(date))
        return true;
    return false;
  }

  public Date getDateOfLastService()
  {
    return services.get(services.size()-1).getDate();
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof ServiceBook)
    {
      ServiceBook other = (ServiceBook) obj;
      return (services.equals(other.services));
    }
    return false;
  }

  public String toString()
  {
    String str = "";
    for (int i = 0; i < services.size(); i++)
      str += services.get(i);
    return str;
  }
}
