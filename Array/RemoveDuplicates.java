package Array;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void rmDuplicate(int[] arr,int[] sizeVariable){
        Map<Integer,Boolean> counting=new HashMap<>();
        int index=0;
        for(int i=0;i<sizeVariable[0];i++){
            if(!counting.containsKey(arr[i])){
                counting.put(arr[i],true);
                arr[index]=arr[i];
                index++;
            }
        }
        sizeVariable[0]=index;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,1,4,3,4,4,4,4,4,4};
        int[] n={arr.length};
        rmDuplicate(arr,n);
        System.out.println();
        for(int i=0;i<n[0];i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
    }
}

