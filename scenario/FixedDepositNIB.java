import java.util.Scanner;
//workshop5
public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = 'y';

        while (ch == 'y') {

            System.out.print("Deposit: ");
            double P = sc.nextDouble();

            System.out.print("Rate (8-12): ");
            double rate = sc.nextDouble();

            System.out.print("Years (max 5): ");
            int years = sc.nextInt();

            double monthlyRate = rate / 12 / 100;
            int months = years * 12;

            double A = P * Math.pow(1 + monthlyRate, months);

            double fee = A * 0.005;
            double finalAmount = A - fee;

            System.out.println("Maturity: " + A);
            System.out.println("Final Amount: " + finalAmount);

            System.out.print("Again? (y/n): ");
            ch = sc.next().charAt(0);
        }

        sc.close();
    }
}