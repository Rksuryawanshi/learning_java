package Array;

public class EquilibriumIndex {
    static int findEquilibriumIdx(int[] arr,int n){
        int totalSum=0,leftSum=0,rightSum=0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        rightSum = totalSum;
        for (int i = 0; i < n; i++) {
            rightSum -= arr[i];  
            if (leftSum == rightSum) {
                return i;        
            }
            leftSum += arr[i];  
        }
        return -1;
    }
    public static void main(String[] args) {
         int[] arr = {1, 2, 0, 3};
        int n = arr.length;

        int equilibriumIdx = findEquilibriumIdx(arr, n);
        System.out.println(equilibriumIdx);
    }
}
