package BasicJava;
import java.util.*;
public class condition {
    public static void main(String[] args) {
        Scanner sec=new Scanner(System.in);
        int age=sec.nextInt();
        if (age>=18) {
            System.out.println("Adult: vote,drive");
        }
        else if (age>13 && age<18) {
            System.out.println("Teeneger");
        }
        else{ 
            System.out.println("child"); 
        }
        int a=sec.nextInt();
        int b=sec.nextInt();
        if (a>b) {
           System.out.println("a is largest than b"); 
        }
        else if (a==b) {
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("b is largest than a");
        }
        int c=sec.nextInt();
        if (c%2==0) {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
        // income tax statement
        int income=sec.nextInt();
        int tax;
        if (income<=250) {
         tax=0;
        }
        else if (income>250 && income<500) {
            tax=(int)(income*0.2);
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("your tax is "+ tax);
         sec.close();
    }
    
    
}
