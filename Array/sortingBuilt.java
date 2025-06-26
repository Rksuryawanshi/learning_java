package Array;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class sortingBuilt {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        // int[] arr1=new int[4];

        

        // for(int i=0;i<4;i++){
        //     arr1[i]=in.nextInt();
        // }
        // Arrays.sort(arr1,0,4);

        //   for(int i=0;i<4;i++){
        //     System.out.print(arr1[i]+" ");
        // }
        // System.out.println(Arrays.toString(arr1));


        /*Using collections ArrayList */
        ArrayList<Integer> arr1=new ArrayList<>();
          for(int i=0;i<4;i++){
            arr1.add(in.nextInt());
        }

        in.close();
        

        /*it is for subpart sort */
        // List<Integer> subarr=arr1.subList(1,3);
        // Collections.sort(subarr);

        Collections.sort(arr1);
        for(int itr:arr1){
            System.out.print(itr+" ");
        }
    }
}








