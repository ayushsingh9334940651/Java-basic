package BasicJava;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sec=new Scanner(System.in);
        System.out.println("enter number a:");
        int a=sec.nextInt();
        System.out.println("enter operator:");
        char operator=sec.next().charAt(0);
        System.out.println("enter number b:");
        int b=sec.nextInt();
         switch (operator) {
            case '+':System.out.println(a+b );
                break;
             case '-':System.out.println(a-b);   
                break;
            case '*':System.out.println(a*b);
                 break;
            case '/':
                if(b==0){
                    System.out.println("error");
                }
                else{
                System.out.println(a/b);}
                break;
            default:System.out.println(a%b);
                break;
        }
        sec.close();
    }
}
