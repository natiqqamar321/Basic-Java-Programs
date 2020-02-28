package programms;
import java.util.*;
public class palindrome {
 public static void main(String[] args){
     int rev,num,sum=0,temp;
     System.out.println("enter the number which you want to check");
  Scanner sc=new Scanner(System.in);
   num=sc.nextInt();
   temp=num;
  while(num>0){
      rev=num%10;
      sum=sum*10+rev;
      num=num/10;
  }
if(sum==temp){
    System.out.println("number is palindrome");
}
 else{
 System.out.println("number is not palindrome");     
            }    
}

}
