import java.util.Scanner;

public class ass12 {
    public static void main(String[] args) {
        //To calculate Fibonacci Series up to n numbers
        int a=0 , b=1;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        for(int i=0;i<n;i++){
           int c=a+b;
           System.out.println(c);
           a=b;
           b=c;
        }
    }
}
