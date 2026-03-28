package BasicJava;
import java.util.*;
public class continuity {
    public static void main(String[] args) {
        Scanner sec=new Scanner(System.in);
        int a;
        int b=6;
        for(a=0;a<=4;a++){
            System.out.println("System Notice: The program has been executed successfully.");
        }
       while (b<=10) {
        System.out.println("Execution completed successfully. No errors detected.:muskan");
        b++;
       }
       System.out.println("Enter number execute program");
       int n=sec.nextInt();
       int counter=0;
       while (counter<=n) {
        System.out.println(counter);
        counter++;
       }
       int i;
       int sum=0;
      for(i=0;i<=n;i++ ) {
        sum+=i;
          }
        System.out.println("sum of n is"+ sum);
        for(int line=1;line<=4;line++){
            System.out.println("****");
        }
        sec.close();
    }
}