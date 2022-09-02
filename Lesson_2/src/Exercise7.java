import java.util.Scanner;

public class Exercise7
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    final int STOCKAMOUNT = 1000;
    final double PURCHASEPRICE = 32.87, SELLINGPRICE = 33.92, COMMISSIONFEE = 0.02;

    System.out.println("How many stocks did you buy?");
    int amountBought = keyboard.nextInt();
    System.out.println("What was the price of one stock when buying?");
    double purchasePrice = keyboard.nextDouble();
    System.out.println("How many stocks did you sell?");
    int amountSold = keyboard.nextInt();
    System.out.println("What was the price of one stock when selling?");
    double sellingPrice = keyboard.nextDouble();
    System.out.println("What was the commission fee?");
    double commissionFee = keyboard.nextDouble();

    System.out.print("Amount paid: ");
    System.out.println(amountBought * purchasePrice);
    System.out.print("Amount payed to the stockbroker at purchase: ");
    System.out.println(amountBought * purchasePrice * commissionFee);
    System.out.print("Amount received: ");
    System.out.println(amountSold * sellingPrice);
    System.out.print("Amount payed to the stockbroker at selling: ");
    System.out.println(amountSold * sellingPrice * commissionFee);
    System.out.print("The profit is: ");
    System.out.println( (amountSold * sellingPrice ) - (amountBought * purchasePrice * commissionFee)
        - (amountBought * purchasePrice) - (amountSold * sellingPrice * commissionFee) );
  }
}
