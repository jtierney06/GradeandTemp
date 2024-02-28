import java.util.Scanner;
public class Grades{
    public static void main (String[] args){
        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the grade1: ");
        grade1 = input.nextInt();
        System.out.print("Enter the grade2: ");
        grade2 = input.nextInt();
        System.out.print("Enter the grade3: ");
        grade3 = input.nextInt();
        System.out.print("Enter the grade4: ");
        grade4 = input.nextInt();
        System.out.print("Enter the grade5: ");
        grade5 = input.nextInt();
        
        
        
        
        input.close();
        double avg = (grade1 + grade2 + grade3 + grade4 + grade5)/5;
        System.out.print("Your average is: " + avg);




    }
}