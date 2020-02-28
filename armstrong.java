
package programms;
import java.util.*;
public class armstrong {
    public static void main(String[] args){
        System.out.println("enter the number which you want to check");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0,r,temp;
        temp=num;
        while(num>0){
            r=num%10;
            sum=sum+r*r*r;
            num=num/10;
        }
        if(temp==sum){
            System.out.println(temp+"  is armstrong number");}
        else
        {
         System.out.println(temp+" is not armstrong number");
            
        }
            
        }
    }
    

