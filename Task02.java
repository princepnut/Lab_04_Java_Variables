import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        double totalCost;
        System.out.print("How much is maintenance for Spring? ");
        Scanner sp = new Scanner(System.in);
        double springCost = sp.nextInt();
        System.out.println("Maintenance for Spring is $" + String.format("%.2f",springCost));
        System.out.print("How much is maintenance for Summer? ");
        Scanner su = new Scanner(System.in);
        double summerCost = su.nextInt();
        System.out.println("Maintenance for Spring is $" + String.format("%.2f",summerCost));
        System.out.print("How much is maintenance for Fall? ");
        Scanner fa = new Scanner(System.in);
        double fallCost = fa.nextInt();
        System.out.println("Maintenance for Spring is $" + String.format("%.2f",fallCost));
        System.out.print("How much is maintenance for Winter? ");
        Scanner wi = new Scanner(System.in);
        double winterCost = wi.nextInt();
        System.out.println("Maintenance for Spring is $" + String.format("%.2f",winterCost));
        totalCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("Total cost for the year is $" + String.format("%.2f",totalCost));
    }
}
