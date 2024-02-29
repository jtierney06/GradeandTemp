import java.util.Scanner;
public class Account {
    public static void main (String[] args){
        String name; 
        String password;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        name = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();
        input.close();
        System.out.print("Your name is " + name);
        System.out.print("\nYour password is " + password);

    }
}
