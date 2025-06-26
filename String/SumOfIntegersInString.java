package String;

public class SumOfIntegersInString {

    static int sumOfIntegers(String s){
        int sum=0,num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else{
                sum+=num;
                num=0;
            }
        }
        return sum+num;
    }
     public static void main(String[] args) {
        String st = "1a30z67";
        System.out.println("Sum: " + sumOfIntegers(st));
    }
}
