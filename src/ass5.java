import java.util.Scanner;

public class ass5 {
    public static void main(String[] args) {
        //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        Scanner in=new Scanner(System.in); 
        int sum=0,n=0;
        // system.in is used to take system input example keyboard
        System.out.println("enter Number:");
        while(in.hasNextInt()){
            
            n=in.nextInt();
            sum=sum+n;
            
        }
        System.out.println("sum now:"+sum);
        
    }
}
