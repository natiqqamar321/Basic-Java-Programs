package programms.arrays;
import java.util.*;
public class leftrotate {
       public static void main(String[] args){
        int arr[];
        arr=new int[5];
        Scanner sc=new Scanner(System.in);
       System.out.println("insert the elements inside the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();}
       System.out.println("enter the number of shifts:");
       int shift =sc.nextInt();
       System.out.println("nicchey to dekho");
       for(int i=0;i<shift;i++){
           {
               int first,j;
               first=arr[0];
               for( j=0;j<arr.length-1;j++)
                   {
                   arr[j]=arr[j+1];
                   //arr[arr.length+1]=arr[j];
                  }
               arr[j]=first;
               System.out.println(arr[j]);
           }
          
               
           }
              System.out.println("array after rotation ");
           for(int j=0;j<arr.length;j++){
               System.out.print(arr[j]+" ");
       }
}}
