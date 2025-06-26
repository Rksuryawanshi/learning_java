package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SymmetricPairs {
    static void findSymmPairs(List<int[]> pairs){
        Map<Integer,Integer> map=new HashMap<>();

        for(int[] pair:pairs){
            int fst=pair[0];
            int sec=pair[1];

            if(map.containsKey(sec) && map.get(sec)==fst){
                System.out.println(sec+" "+fst);
            }
            else{
                map.put(fst,sec);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<int[]> pairs=new ArrayList<>();

        for (int i = 0; i < n; i++) {
           //(x,y)
            // String input = in.next(); 
            int x = in.nextInt();
            // input = in.next();        
            int y = in.nextInt();
            // input = in.next();       
            pairs.add(new int[]{x,y});
        }
        findSymmPairs(pairs);
        in.close();
    }
}
