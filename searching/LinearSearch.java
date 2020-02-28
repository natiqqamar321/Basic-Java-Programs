package programms.searching;
import java.util.Scanner;
public class LinearSearch {
    public static void LinearSearch(int arr[])
    { int flag=0;
       Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
               flag=1;
               break;}
            else
                flag=0;
                }
        if(flag==1)System.out.println(" found "+key);else System.out.println("can't found "+key);
    }
    public static void main(String args[]){
        int arr[];
        arr=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("fill the array");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("enter the value of key which you want to check");
       // int key=sc.nextInt();
        LinearSearch(arr);
        
    }
    
}
