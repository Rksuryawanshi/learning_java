package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelativeSorting {
    static void sortRefArr(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        Map<Integer,Integer> freqmp=new HashMap<>();
        for(int key:arr1){
            freqmp.put(key,freqmp.getOrDefault(key,0)+1);
        }

        int index=0;

        for(int i=0;i<m;i++){
            int val=arr2[i];
            if(freqmp.containsKey(val)){
                int count=freqmp.get(val);
                while(count!=0){
                    arr1[index++]=val;count--;
                }
                freqmp.remove(val);

            }
        
        }
        List<Integer> rmain=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:freqmp.entrySet()){
            int value=entry.getKey();
            int count=entry.getValue();
            for (int j = 0; j < count; j++) {
                rmain.add(value);
            }
        }

        Collections.sort(rmain);
        for(int itr:rmain){
            arr1[index++]=itr;
        }




    }


    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] arr2 = {2, 1, 8, 3};

        sortRefArr(arr1, arr2);

        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
