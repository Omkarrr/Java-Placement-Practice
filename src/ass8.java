import java.util.Scanner;

public class ass8 {
    public static void main(String[] args) {
       // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in=new Scanner(System.in);
        System.out.print("Enter principle:");
        int p=in.nextInt();
        System.out.print("Enter rate:");
        int r=in.nextInt();
        System.out.print("Enter time:");
        int t=in.nextInt();
        int si=(p*r*t);
        System.out.println("Simple interest is:"+si);

    }
}
