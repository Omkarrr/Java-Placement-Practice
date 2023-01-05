import java.util.Scanner;

public class ass3 {
    public static void main(String[] args) {
       // Take a number as input and print the multiplication table for it.
       Scanner in=new Scanner(System.in); 
       // system.in is used to take system input example keyboard
       System.out.print("Enter a number to print Multiplication table:");
       int num=in.nextInt();
       int i=0;
       while(i<=10)
       {
            System.out.println(num+"X"+i+"="+(num*i));
            i++;
       }
    }
    
}
