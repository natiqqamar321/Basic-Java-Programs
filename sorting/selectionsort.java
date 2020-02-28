
package programms.sorting;
import java.util.*;
public class selectionsort{
    static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                  if(arr[j]<arr[index]){
                      index=j;
                      }
           
            }
            int smallerNumber=arr[index];
            arr[index]=arr[i];
            arr[i]=smallerNumber;
        }
    }
    public static void main(String args[]){
        int arr[];
        arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("fill the element inside array");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>10)
            {
                System.out.println("more than 10 not allow after 10 values ,values will be droped");
                
            }
           
           // arr[i]=sc.nextInt();
        }
        System.out.println("array before sorting\n");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        SelectionSort(arr);
        System.out.println("\narray after selectionsort\n");
          // SelectionSort(arr1);
           for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
           }
    }
}  
