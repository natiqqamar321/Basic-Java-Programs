package programms.sorting;
import java.util.*;
public class bubblesort {
    static void bubblesort(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-i);j++)
            {
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
   public static void main(String[] args){
       
       int arr[];
       arr=new int[10];
       System.out.println("fill the elements inside array");
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<arr.length;i++)
       {
         arr[i]=sc.nextInt();   
       }
       System.out.println("array before sorting ");
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
           }
       bubblesort(arr);
       System.out.println("array after bubble sort");
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
   } 
    
}
