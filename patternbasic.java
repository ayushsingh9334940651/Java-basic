package BasicJava;
import java.util.*;
public class patternbasic {
    public static void starprint(int n){
        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
            System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void invertedstar(int n){
        for(int line=1;line<=n;line++){
            for(int star=1;star<=(n-line+1);star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }  
    public static void numberdraw(int n){
        for( int line=1;line<=n;line++){
            for(int number=1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
    public static void alphabet(int n){
          char ch='A';
        for(int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
                
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
      public static void main(String[] args){
        Scanner sec=new Scanner(System.in);
        System.out.println("Enter int number for print star");
        int n=sec.nextInt();
        starprint(n);
        System.out.println("next mood");
        invertedstar(n);
        System.out.println("Enter int number for print number drawing");
        int b=sec.nextInt();
        numberdraw(b);
        System.out.println("Enter int number for print Albhabet & character");
        int c=sec.nextInt();
        alphabet(c);
        sec.close();
    }
}
