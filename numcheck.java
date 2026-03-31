package BasicJava;
import java.util.*;
public class problem {
 public static void main(String[] args) {
    Scanner sec=new Scanner(System.in);
    // use for find sum of odd and even digit in any number
    int n=sec.nextInt();
    int digit;
    int sumeven =0;
    int sumodd=0;
    while (n>0) {
        digit=n%10;
        n/=10;
        if (digit%2==0 ) {
            sumeven+=digit;
        }
        else{
            sumodd+=digit;
        }
    }
    System.out.println( "even integer sum is_" +sumeven);
    System.out.println("odd integer sum is_"+ sumodd);
    //use for write table
    int m=sec.nextInt();
    int mul;
    for(int i=1;i<=10;i++){
      mul=m*i;
       System.out.println(m+"*"+i +"="+mul);
    }
    sec.close();
 }
    
}