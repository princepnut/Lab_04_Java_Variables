import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        System.out.print("How much is your item? ");
        Scanner in = new Scanner(System.in);
        int priceItem = in.nextInt();
        double salesTax;
        double fullPrice;
        salesTax=(priceItem * .05);
        fullPrice= salesTax + priceItem;
        System.out.println("Your total cost is $" + String.format("%.2f",fullPrice));
        System.out.println("5% tax on this item is $" + String.format("%.2f", salesTax));

    }
}
