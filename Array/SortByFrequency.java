package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {
    static class PairComparator implements Comparator<Map.Entry<Integer,Integer>>{
        public int compare(Map.Entry<Integer, Integer> x, Map.Entry<Integer, Integer> y){
            if(x.getValue().equals(y.getValue())){
                return Integer.compare(x.getKey(),y.getKey());
            }
            return Integer.compare(y.getValue(),x.getValue());
        }
    }

    static void sortByFrequency(int[] arr,int n){
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int i=0;i<n;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(freqMap.entrySet());

        Collections.sort(list,new PairComparator());

        for(Map.Entry<Integer,Integer> entry:list){
            int key=entry.getKey();
            int freq=entry.getValue();
            for(int i=0;i<freq;i++){
                System.out.print(key+" ");
            }
        }
        
    }


    public static void main(String[] args) {
        int[] arr= {4,5,6,5,4,3};
        int n=arr.length;
        sortByFrequency(arr,n);
    }
}
