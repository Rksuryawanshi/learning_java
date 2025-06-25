package Array;
import java.util.Scanner;
import java.util.ArrayList;

public class findMin{
    static int findminm(ArrayList<Integer> arr){
         int min=Integer.MAX_VALUE;
        for(int itr:arr){
          min=Math.min(min,itr);  
        }
        return min;

    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<4;i++){
            arr.add(in.nextInt());
        }
        System.out.println("here is minimum "+ findminm(arr));
        in.close();
    }
}






// public class findMin {
//     static int findMinm(int[] arr){
//         int min=Integer.MAX_VALUE;
//         for(int itr:arr){
//           min=Math.min(min,itr);  
//         }
//         return min;
//     }
//     public static void main(String[] argst){
//         Scanner in=new Scanner(System.in);
//         System.out.println("enter szie followed by elements");
//         int var=in.nextInt();

//         int[] arr=new int[var];
       
//         for(int i=0;i<var;i++){
//             arr[i]=in.nextInt();
//         }
//         System.out.println("minimum element is :"+findMinm(arr));
//         in.close();

//     }    
// }
