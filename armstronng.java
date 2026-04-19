package BasicJava;
import java.util.*;
public class armstronng {
    public static void main(String[] args){
     int num =153;
     int sum =0;
    int count=0;
    int y=0;
    int tem=num;
     while(num>0){
        count++;
       num =num/10;
        
     }
     num=tem;
     while(num>0){
        y=num%10;
        sum+=Math.pow(y,count);
       num/=10;
     }
     System.out.println(sum);
    }
}
