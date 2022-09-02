public class ComputerTest
{
  public static void main(String[] args)
  {
    CPU cpu1 = new CPU("Intel", "i7", 3600, 4);
    CPU cpu2= new CPU("AMD", "Radeon 7", 3200, 6);

    System.out.println(cpu1);
    System.out.println(cpu2.getBrand() + cpu2.getModel() + cpu2.getClockFrequency() + cpu2.getCores());

    Computer comp1 = new Computer("Dell", "Optiplex 7700");
    Computer comp2 = new Computer("Apple", "iMac");

    comp1.setCPU(cpu1);
    comp2.setCPU(cpu2);

    System.out.println(comp1);
    System.out.println(comp2.getCpu() + comp2.getBrand() + comp2.getModel() + comp2.getCPUBrand());
  }
}
