import java.util.Scanner;
public class Temp {
    public static void main (String[] args){
       int far;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the far temp: ");
       far = input.nextInt();
       input.close();
       int cel = (far - 32) * 5/9;
       System.out.print("The temp in cel is " + cel);
    }
}
