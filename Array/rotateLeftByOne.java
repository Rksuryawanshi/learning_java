package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class RotateLeft{
    public static void RotateLeftbyOne(List<Integer> arr){
        int n=arr.size();

        int first=arr.get(0);
        for(int i=0;i<n-1;i++){
            arr.set(i,arr.get(i+1));
        }
        arr.set(n-1,first);

    }
} 

public class rotateLeftByOne {
    public static void main(String[] args) {
        List<Integer>  arr1=new ArrayList(Arrays.asList(1,2,3,4,5));
        RotateLeft.RotateLeftbyOne(arr1);
        System.out.println(arr1);
    }
}
