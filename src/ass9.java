
import java.util.Scanner;

public class ass9 {
    public static void main(String[] args) {
       // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
       System.out.println("Enter your choice (+, -, *, /)");
       int a=10,b=10;
       Scanner in=new Scanner(System.in);
       String x=in.nextLine();
       if(x.equals("+")){
            System.out.println(a+b);
       }
       if(x.equals("-")){
        System.out.println(a-b);
        }
        if(x.equals("/")){
            System.out.println(a/b);
       }
       if(x.equals("*")){
        System.out.println(a*b);
        }
    }
}
