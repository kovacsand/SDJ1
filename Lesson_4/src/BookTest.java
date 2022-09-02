import java.util.Scanner;

public class BookTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String tempAuthor, tempTitle;
    double tempPrice;
    int tempPages;

    //First book
    System.out.println("Who is the author of the first book?");
    tempAuthor = keyboard.nextLine();
    System.out.println("What is the title of the first book?");
    tempTitle = keyboard.nextLine();
    System.out.println("What is the price of the first book?");
    tempPrice = keyboard.nextDouble();
    System.out.println("How many pages are in the first book?");
    tempPages = keyboard.nextInt();

    Book firstBook = new Book(tempAuthor, tempTitle, tempPrice, tempPages);

    //weird thing
    keyboard.nextLine();

    //Second book
    System.out.println("Who is the author of the second book?");
    tempAuthor = keyboard.nextLine();
    System.out.println("What is the title of the second book?");
    tempTitle = keyboard.nextLine();
    System.out.println("What is the price of the second book?");
    tempPrice = keyboard.nextDouble();
    System.out.println("How many pages are in the second book?");
    tempPages = keyboard.nextInt();

    Book secondBook = new Book(tempAuthor, tempTitle, tempPrice, tempPages);

    firstBook.setPrice(firstBook.getPrice() * 0.8);
    secondBook.setPrice(secondBook.getPrice() * 0.8);

    System.out.println(firstBook);
    System.out.println(secondBook);
  }
}
