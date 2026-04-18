import java.util.Scanner;
//workshop4
public class  Scholarship{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter GPA betwen 0.0 to 4.0: ");
        double gpa = sc.nextDouble();

        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: Invalid GPA.");
        } 
        else {
            if (gpa >= 3.8) {
                System.out.println("Eligible for full scholarship");
            } 
            else if (gpa >= 3.2) {
                System.out.println( "Eligible for partial scholarship");
            } 
    
            else {
                System.out.println("Not eligible for scholarship") ;
            }
        }

        sc.close();
    }
}