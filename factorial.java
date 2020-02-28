
package programms;
import java.util.*;
public class factorial {
    public static void main(String[]args){
        System.out.println("enter the number for factorial");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }System.out.println(fact+" Is the factorial of "+num);
    }
    
}
