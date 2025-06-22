package Basics;

public class armStrngNum {
   static boolean isArmstrongNumber(int num){
        int digits=0,temp=num,sum=0;
        while (temp!=0){
            digits++;
            temp/=10;
        }
        temp=num;
        while(temp!=0){
            int d=temp%10;
            sum+=Math.pow(d,digits);
            temp/=10;
        }
       
        return sum==num;

        
    } 
    
    public static void main(String[] args ){
        for(int i=0;i<500;i++){
           if(isArmstrongNumber(i)){
            System.out.println(i + " ");
           } 
        }
    }
}
