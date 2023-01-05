import java.util.Scanner;

public class ass1 {
    public static void main(String[] args) {
        //Input a year and find whether it is a leap year or not.
        Scanner in=new Scanner(System.in); 
       // system.in is used to take system input example keyboard
       System.out.print("Enter a year:");
       int year=in.nextInt();
        //leap year comes every 4 year and 400 for and 100 is used to check the centuary year 
       if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                {
                    System.out.println("It is a leap year");
                }
                else{
                    System.out.println("It is not year");
                }
            }
            else{
                System.out.println("It is a leap year");
            }
        }
       else{
        System.out.println("It is not a leap year");
       }
       
       System.out.println("Thank-You!!!");

    }
}
