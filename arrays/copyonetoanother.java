package programms.arrays;
import java.util.*;
public class copyonetoanother {
    public static void main(String args[]){
        int arr1[];
        arr1=new int[5];
        int arr2[];
        arr2=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
          System.out.print(arr1[i]+" ");
        }
        System.out.println("see values copied into arr2 ");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr1[i];
            System.out.print(arr2[i]+" ");
        }
    }
    
}
