import java.util.Scanner;
public class ex1 {
    public static void main (String[] args){
       int num;
       int num2;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       num = input.nextInt();
       System.out.print("Enter a second integer: ");
       num2 = input.nextInt();
       input.close();
        int first = num/num2;
        int second = num2/num;
        System.out.print(num + "/" + num2 + " = " + first);
        System.out.print("\n" + num + "÷" + num2 + " = " + first);
        System.out.print("\n" + num2 + "/" + num + " = " + second);
        System.out.print("\n" + num2 + "÷" + num + " = " + second);


    }
}
