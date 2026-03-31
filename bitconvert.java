package BasicJava;
import java.util.*;
public class bitconvert {
 public static int bintodeci(int n){
    int pow=0;
    int deci=0;
    while(n>0){
      int rem=n%10;
      deci=deci+(rem*(int)Math.pow(2,pow));
      pow++;
      n/=10;
    }
    return deci;
   }
 public static void decitobine(int n){
    int num=n;
    int bin=0;
    int powe=0;
    int remender;
    while(n>0){
     remender=n%2;
     bin=bin+(remender*(int)Math.pow(10, powe));
     powe++;
     n/=2;
    }
 System.out.println("binary of"+num+"is_"+bin);
 }
 public static void main(String[] args){
 Scanner sec=new Scanner(System.in);
 System.out.println("use for convert decimal to binary system");
int n=sec.nextInt();
decitobine(n);
System.out.println("use for convert binary to decimal system");
int m=sec.nextInt();
 System.out.println("number is"+bintodeci(m));
 sec.close();
 }
}
