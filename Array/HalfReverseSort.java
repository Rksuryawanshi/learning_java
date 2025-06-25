package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HalfReverseSort {
   public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    List<Integer> list = new ArrayList<>(n);

     
    for(int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list);

    in.close();

    int mid=n/2;
    List<Integer> sublist=list.subList(mid,n);
    Collections.reverse(sublist);
    
        for (int num : list) {
            System.out.print(num + " ");
        }


   }
        

}
