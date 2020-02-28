
package programms.sorting;
import java.util.*;
public class selectionsortwoutmethod {
    public static void main(String args[]){
        int arr[];
        arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("fill the array");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("array before sorting");
           for(int i=0;i<arr.length;i++)
               System.out.println(arr[i]);
           for(int i=0;i<arr.length-1;i++)
           {
               for(int j=i+1;j<arr.length;j++){
                   if(arr[i]>arr[j]){
                       int temp=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                   }
               }
           }
           System.out.println("after selection sort");
           for(int i=0;i<arr.length;i++)
               System.out.print(arr[i]+" ");
    }
    
}
