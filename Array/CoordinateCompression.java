package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoordinateCompression {
    public static void main(String[] args) {
        int n=6;
    int[] arr={20,15,26,2,98,6};
    int[] brr=new int[n];
                
    for(int i=0;i<n;i++){
        brr[i]=arr[i];

    }
    Arrays.sort(brr);

    Map<Integer,Integer>mp=new HashMap<>();
    int temp=1;

    for(int i=0;i<n;i++){
        if(!mp.containsKey(brr[i])){
            mp.put(brr[i],temp);
            temp++;
        }
    }
    for(int i=0;i<n;i++){
        System.out.println(mp.get(arr[i]));
    }

    }
}
