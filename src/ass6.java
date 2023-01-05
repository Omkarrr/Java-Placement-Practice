import java.util.Scanner;

public class ass6 {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=in.nextInt();
        if(a%2==0){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd");
        }
    }   
}
