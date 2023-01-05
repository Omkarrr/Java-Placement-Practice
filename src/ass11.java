import java.util.Scanner;

public class ass11 {
    public static void main(String[] args) {
        //Input currency in rupees and output in USD.
        System.out.println("Your personal currency converter");
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the inr to covert:");
        float a=in.nextFloat();
        float b=74.6f;
        float convert=a/b;
        System.out.println("Conversion USD:"+convert);
    }
}
