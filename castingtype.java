package BasicJava;
import java.util.*;
public class castingtype {
 public static void main(String[] args) {
    Scanner sec=new Scanner(System.in);
   //byte, short, and char are always promoted to int.
   // byte, short, and char are always promoted to int.
   byte a=5;
    a=(byte) (a*5);
     System.out.println(a);
    //we use byte in bracket ,due to type promotion first byte is converted into int so it cross  the limit of byte
    int c=5;
   float d=6.5f;
   double e=5.66543513f;
   char ch='a';
   double average=c+d+e+ch/4;
    System.out.println("the average of number"+average);
    sec.close();
 }   
    }
