package Basics;
import java.util.Scanner;

public class Palindrime {
    static boolean isPalindrome(int num){
        int temp=num,newNum=0;
        if(temp==0) return false;
        while(temp!=0){
            newNum=newNum*10+(temp%10);
            temp/=10;
        }
        return newNum==num;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter karo number");
        int n=in.nextInt();

        boolean x = isPalindrome(n);
        if (x) {
            System.out.println(" Yes , Palindrome");
        } else {
            System.out.println("Ahh Oh na na na");
        }
        in.close();
    }    
}
