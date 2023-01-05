import java.util.Scanner;

public class ass2 {
    public static void main(String[] args) {
        //Take two numbers and print the sum of both.
        Scanner in=new Scanner(System.in); 
          // system.in is used to take system input example keyboard
       System.out.print("Enter a num1:");
       int num1=in.nextInt();
       System.out.print("Enter a num2:");
       int num2=in.nextInt();
       System.out.println("Sum is:"+(num1+num2));
    }
}
