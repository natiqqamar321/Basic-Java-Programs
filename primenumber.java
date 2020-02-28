
package programms;
import java.util.*;
public class primenumber {
    public static void main(String[] args){
       int Flag=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
         if(num==0||num==1)
         {
             System.out.println(num+" number is not a prime ");
         }
         else{
             for(int i=2;i<=num/2;i++)
             {
                 if(num%i==0)
                 {
                     System.out.println(num+" is not a prime");
                     Flag=1;
                     break;
                 }
             }
             if(Flag==0){
                 System.out.println(num+" number is prime");
             }
         }
    }
    
}
