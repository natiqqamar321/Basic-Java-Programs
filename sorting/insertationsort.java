package programms.sorting;
import java.util.*;
public class insertationsort {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int arr[];
     arr=new int[5];
    System.out.println("enter the value inside array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=1;i<arr.length;i++){
        int temp =arr[i];
        int j=i;
        while(j>0&& arr[j-1]>temp){
            arr[j]=arr[j-1];
             j--;
            }
        arr[j]=temp;
    }
    System.out.println("sorted array after insertation sort");
    for (int i:arr){
        System.out.print(i+" ");
    }
 }   
    
}