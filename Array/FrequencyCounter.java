package Array;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    static void countFrequency(int[] arr){
        int n=arr.length;
        Map<Integer,Integer> mpCount=new HashMap<>();
        for(int key:arr){
            mpCount.put(key,mpCount.getOrDefault(key,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mpCount.entrySet()){
            System.out.println(entry.getKey() +" " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countFrequency(arr);
        sc.close();

    }
}
