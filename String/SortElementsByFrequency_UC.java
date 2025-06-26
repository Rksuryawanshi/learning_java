package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SortElementsByFrequency_UC {
    static void sortByFrequency(int[] arr){
        Map<Integer,Integer> freqMap=new HashMap<>();

        for(int itr:arr){
            freqMap.put(itr,freqMap.getOrDefault(itr,0)+1);
        }

        List<Map.Entry<Integer,Integer>> freqlist=new ArrayList<>(freqMap.entrySet());
        



        
        // nahi samajh me aaya hai



        freqlist.sort((a,b)->{
            if (!Objects.equals(a.getValue(), b.getValue())){
                return b.getValue() - a.getValue();
            }
            else
            return a.getValue()-b.getValue();
        });


        for (Map.Entry<Integer, Integer> entry : freqlist) {
            int value = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                System.out.print(value + " ");
            }
        }

        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 3, 5, 2, 1, 1, 2};
        sortByFrequency(arr);
    }
}
