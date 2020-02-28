package programms.arrays;
import java.util.*;
public class PrintDuplicateElement {
    public static void main(String[]args){
        int arr[];
        arr=new int[20];
        Scanner sc=new Scanner (System.in);
        System.out.println("Insert the value insode the Array");
        for(int i=0;i<10;i++)
            arr[i]=sc.nextInt();
        System.out.println("Array with the duplicates values: ");
             for(int i=0;i<10;i++)
                 System.out.print(arr[i]+"\n");
             System.out.println("Array with the duplicates values: ");
             for(int i=0;i<10;i++){
                 for(int j=i+1;j<10;j++){
                     if(arr[i]==arr[j]){
                        System.out.println(arr[i]); 
                        
                     }
                 }
             }
             
    }
    
}
