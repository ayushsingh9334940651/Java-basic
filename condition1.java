package BasicJava;
import java.util.*;
public class condition1 {
    public static void main(String[] args) {
        Scanner sec=new Scanner(System.in);
        int a=sec.nextInt();
        int b=sec.nextInt();
        int c=sec.nextInt();
        /*if (a>b) {
           if (a>c) {
            System.out.println("a is largest number");
           } 
           else {
            System.out.println("c is largest number");
           }
        }
        else if (b>a) {
            if (b>c) {
              System.out.println("b is largest number");  
            }
            else{ 
                System.out.println("c is largest number");
            }
        } */
       // this is not right way to find largest number in 3 number.....
       if (a>b && a>c) {
        System.out.println("a is largest number");
       }
       else if (a==b && b==c) {
        System.out.println("a is equal to a & b");
       }
       else if (b>c) {
        System.out.println("b is largest number");
       }
        else {
        System.out.println("c is largest number");
       }
       // some time we also use ternary operator as a if, esle  statement
       int number=sec.nextInt();
       String type=(number%2==0)?"even":"odd";
       System.out.println(type);
       System.out.println("press any integer for taking food");
       int value=sec.nextInt();
       switch (value) {
        case 1 :System.out.println("samosa mila hai");
             break;
        case 2:System.out.println("litti chokha mila hai");     
             break;
        default:System.out.println("kuch nhi mila hai");
            break;
       }
        sec.close();
    }
}
