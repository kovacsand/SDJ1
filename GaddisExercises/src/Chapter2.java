public class Chapter2
{
  public static void main (String[] args) {
    //2.38
    double numbera = 1234567.456;
    System.out.printf("%,20.2f\n", numbera);

    //2.39
    double numberb = 123.456;
    System.out.printf("%10.1f\n", numberb);

    //2.40
    double numberc = 123.456;
    System.out.printf("%08.1f\n", numberc);

    //2.41
    int numberd = 123456;
    System.out.printf("%,010d\n", numberd);

    //2.42
    double numbere = 123456.789;
    System.out.printf("%-,20.2f\n", numbere);

    //2.43
    String name = "James";
    System.out.printf("%20s\n", name);
  }
}
