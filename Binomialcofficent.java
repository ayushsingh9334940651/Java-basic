package BasicJava;
import java.util.*;
public class Binomialcofficent {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;}
            return f;
        }
        public static int binomcoff(int n,int r){
            int fac_n=factorial(n);
            int fac_r=factorial(r);
            int fac_nmr=factorial(n-r);
            int binomial=fac_n/(fac_r*fac_nmr);
            return binomial;
        }
    public static void main(String[] args){
        Scanner sec=new Scanner(System.in);
        System.out.println("enter value of n");
        int a=sec.nextInt();
         System.out.println("enter value of r");
        int b=sec.nextInt();
        int factorial=factorial(a);
        System.out.println("factorial is equal to-"+factorial);
        int binomial=binomcoff(a,b);
        System.out.println("binomial of  number is_"+binomial);
        sec.close();
    }
}
