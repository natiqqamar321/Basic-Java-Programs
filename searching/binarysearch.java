package programms.searching;
import java.util.*;
public class binarysearch {
 public static void main(String[]args){
     int arr[];
     arr=new int[10];
     Scanner sc=new Scanner(System.in);
     System.out.println("fill the array");
     for(int i=0;i<arr.length;i++)
         arr[i]=sc.nextInt();
     int first=0,last=arr.length-1;
     System.out.println("enter the value of key");
     int key=sc.nextInt();
     int mid=first+last/2;
     while(first<=last){
         if(arr[mid]>key)
             last=mid-1;
         else if(arr[mid]==key){
             System.out.println("found "+key);
         break;}
         else
             first=mid+1;
         mid=first+last/2;
    }
     if(first>last)
         System.out.println("can't found "+key);
 }   
}
