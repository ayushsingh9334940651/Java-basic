package BasicJava;
import java.util.*;
public class pattern { 
   public static void hollow_pattern(int row,int column){
       for(int i=1;i<=row;i++){
         for(int j=1;j<=column;j++){
            if(i==1||i==row||j==1||j==column){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         } 
         System.out.println("");
       }
   }
   
   public static void inverted_R_pyramid(int row,int column){
      for(int i = 1;i<=row;i++){
         for(int j=1;j<=row-i;j++){
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println("");
      }
   }
   public static void invertednumber_pyramid(int row,int column){
      for(int i = 1;i<=row;i++){
         for(int j=1;j<=row-i+1;j++){
           // int number=1;
            System.out.print(j);
         }
         for(int j=1;j<=i;j++){
            System.out.print("");
         }
         
         System.out.println("");

         }
      }
   public static void floyd_tri_pattern(int n){
      int counter=1;
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print(counter+"");
            counter++;
         }
         System.out.println("");
      }
   }
   public static void rhombus_H_pattern(int row,int column){
      for(int i=1;i<=row;i++){
         for(int j=1;j<=row-i;j++){
            System.out.print(" ");
         }
         for(int j=1;j<=column;j++){
            if(i==1 ||i==row||j==1||j==column){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         System.out.println("");
      }
   }
   public static void batterfly_pattern(int n){
      for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println("");
      }
       for(int i=n;i>=1;i--){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println("");
      }
   }
   public static void diamond_pattern(int n){
      for(int i=1;i<=n;i++){
       for(int j=1;j<=n-i;j++){
         System.out.print(" ");
       }
       for(int j=1;j<=2*i-1;j++){
         System.out.print("*");
       }
       System.out.println("");
      }
      for(int i=n;i>=1;i--){
       for(int j=1;j<=n-i;j++){
         System.out.print(" ");
       }
       for(int j=1;j<=2*i-1;j++){
         System.out.print("*");
       }
       System.out.println("");
      }
   }
    public static void main(String[] args){
    Scanner sec=new Scanner(System.in);
    System.out.println("enter row and column");
    int i=sec.nextInt();
    int j=sec.nextInt();
    hollow_pattern(i,j);
    System.out.println("next type pattern");
    inverted_R_pyramid(i,j);
     System.out.println("next type pattern");
    invertednumber_pyramid(i,j);
     System.out.println("next type pattern");
    floyd_tri_pattern(i);
    System.out.println("next type pattern");
    rhombus_H_pattern(i,j);
    System.out.println("next type pattern");
    batterfly_pattern(i);
    System.out.println("next type pattern");
    diamond_pattern(i);
    sec.close();
 }
}
