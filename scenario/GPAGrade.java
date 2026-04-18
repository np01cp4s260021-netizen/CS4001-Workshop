import java.util.Scanner;
//workshop4
public class GPAGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter GPA betwen 0.0 to 4.0: ");
        double gpa = sc.nextDouble();

        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: Invalid GPA.");
        } 
        else {
            String grade;
            if (gpa >= 3.8) {
                grade = "A+";
            } 
            else if (gpa >= 3.6) {
                grade = "A";
            } 
            else if (gpa >= 3.0) {
                grade = "C";
            } 
            else if (gpa >= 2.0) {
                grade = "D";
            } 
            else if(gpa >=1.0){
                grade = "E";
            }
            else {
                grade = "fail";
            }

            System.out.println("Grade: " + grade);
        }

        sc.close();
    }
}