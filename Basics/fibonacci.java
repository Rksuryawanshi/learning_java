package Basics;
import java.util.Scanner;

public class fibonacci {
    static int fiboAtIndex(int num){
        double sqrt5=Math.sqrt(5);
        double phi=(1+sqrt5)/2;
        double psi=(1-sqrt5)/2;
        double result=(Math.pow(phi,num)-Math.pow(psi,num))/sqrt5;
        return (int)result;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("fibonacci is " + fiboAtIndex(num));
        in.close();
    }
}
