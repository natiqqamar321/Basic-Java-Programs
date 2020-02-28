package programms;
import java.util.*;
public class fabwtres {
    public static void main(String[] args)
    {
        int num,n1=0,n2=1,n3;
        System.out.println("enter the number till you want the fabonic series");
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         System.out.print(n1+" "+n2);
        for(int i=2;i<num;i++)
        {
           n3=n1+n2;
           System.out.print(" "+n3);
           n1=n2;
           n2=n3;
            
        }
    }
    
}
