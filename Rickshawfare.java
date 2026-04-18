import java.util.Scanner;
//workshop3
public class Rickshawfare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance: ");
        double dist = sc.nextDouble();

        System.out.print("Enter time: ");
        double time = sc.nextDouble();

        System.out.print("Local (yes/no): ");
        String local = sc.next();

        System.out.print("Night (yes/no): ");
        String night = sc.next();

        double fare = 20 + dist * 10 + time * 2; 


        if (local.equals("yes") && dist > 10) {
            fare = fare * 0.8;
        }

    
        if (night.equals("yes")) {
            fare = fare * 1.10;
        }

        System.out.println("Total Fare: Rs. " + (int) fare);

        sc.close();
    }
}