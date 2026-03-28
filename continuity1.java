package BasicJava;
import java.util.*;
public class continuity1 {
    public static void main(String[] args) {
        Scanner sec=new Scanner(System.in);
        int n=sec.nextInt();
        int last;
        while (n>0) {
            last=n%10;
            n/=10;
            System.out.print(last);
        }
       // below code for number reverse
        int m=sec.nextInt();
        int remender;
        int reverse=0;
        while (m>0) {
            remender=m%10;
            m/=10;
            reverse=(reverse*10)+remender;
        }
        System.out.println(reverse);
        // do while case
        do{
            System.out.println("Enter your number");
            int number=sec.nextInt();
            if (number%10==0) {
                break;
            }
            System.out.println("your number has__" + number);
        } while(true);
        sec.close();
    }
}
