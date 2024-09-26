import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        System.out.print("Please enter a number ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if((input % 2) == 0) {
            System.out.println("Your number is even");
        }
        else {
                System.out.println("Your number is odd");
        }

    }
}
