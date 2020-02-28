package programms.arrays;
import java.util.*;
public class frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[];
        arr=new int[5];
        for(int i=0;i<arr.length;i++)
         arr[i]=sc.nextInt();
        int[] fr=new int[arr.length];
        int visited =-1;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]=visited;
                }
                
            }
           if(fr[i]!=visited)
                    fr[i]=count; 
        }
        System.out.println("element  |  frequency");
        System.out.println("------------------------");
        for(int i=0;i<arr.length;i++){
            if(fr[i]!=visited)
                System.out.println(arr[i]+ "      |    " +fr[i]);
        }
        System.out.println("-------------------------");
    }
    
}
