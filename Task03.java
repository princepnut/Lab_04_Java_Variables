public class Task03 {
    public static void main(String[] args) {
        double A1;
        double A2;
        System.out.println("You have $5000 dollars.");
        A1= ((.17 / 12) * 5000);
        A2= A1 + A1;
        System.out.println("Your interest due after 1 month is $" + String.format("%.2f",A1));
        System.out.println("Your interest due after 2 months is $" + String.format("%.2f",A2));

    }

}