public class Computer
{
  private String brand;
  private String model;
  private CPU cpu;

  public Computer(String brand, String model)
  {
    this.brand = brand;
    this.model = model;
  }

  public void setCPU(CPU cpu)
  {
    this.cpu = cpu;
  }

  public CPU getCpu()
  {
    return cpu;
  }

  public String getBrand()
  {
    return brand;
  }

  public String getModel()
  {
    return model;
  }

  public String getCPUBrand()
  {
    return cpu.getBrand();
  }

  public String toString()
  {
    return String.format("The %s is made by %s.\nIts CPU is like this: %s", model, brand, cpu.toString());
  }
}
