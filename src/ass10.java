

import java.util.Scanner;

public class ass10 {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner in=new Scanner(System.in);
        System.out.println("enter 2 number");
        int a=in.nextInt();
        int b=in.nextInt();
        if(a>b){
            System.out.println("a is greater:"+a);
        }
        else{
            System.out.println("b is greater"+b);
        }
    }
}
