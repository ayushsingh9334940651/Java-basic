package BasicJava;
import java.util.*;
public class methoddeclaration {
    public static void helloprint(){
        System.out.println("hello world");
        return;
    }
     public static int multiple(int a,int b){
        int multiply=a*b;
        return multiply;
     }
     public static void changenumber ( int a,int b){
          int temp=a;
          a=b;
          b=temp;
          System.out.println("a is__"+a);
          System.out.println("b is__"+b);
     }
    public static void main(String[] args) {
        helloprint();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result = multiple(a,b);
        System.out.println("The result of multiplication is: " + result);
        int x=3;
        int y=5;
        changenumber(x,y);
        sc.close();
    }
}