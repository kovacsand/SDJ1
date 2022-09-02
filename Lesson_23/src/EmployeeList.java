import java.util.ArrayList;
import java.util.Objects;

public class EmployeeList
{
  private int size;
  private ArrayList<Employee> employees;

  public EmployeeList(int maxNumberOfEmployees)
  {
    this.size = maxNumberOfEmployees;
    employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee)
  {
    if (employees.size() < size)
      employees.add(employee);
  }

  public void removeEmployee(Employee employee)
  {
    employees.remove(employee);
  }

  public int getNumberOfEmployees()
  {
    return employees.size();
  }

  public Employee[] getAllEmployees()
  {
    return employees.toArray(new Employee[employees.size()]);
  }

  public double getTotalEarningsPerWeek()
  {
    double sum = 0;
    for (int i = 0; i < employees.size(); i++)
      sum += employees.get(i).earningsPerWeek();
    return sum;
  }

  public String toString()
  {
    String str = "The company has " + getNumberOfEmployees() + " employees.\n";
    for (int i = 0; i < employees.size(); i++)
      str += employees.get(i).toString();
    return str;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof EmployeeList))
      return false;
    EmployeeList other = (EmployeeList) obj;
    return employees.equals(other.employees) && size == other.size;
  }
}
