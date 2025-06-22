package Basics;
import java.util.Scanner;

public class Prime {
    static void isPrime(int num){
        if(num<2) System.out.println("G Nahi");
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) {
                System.out.println("G Nahi");
                return;
            }
            
        }
        System.out.println("Ha G hai");
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        isPrime(num);
        in.close();
    }
}
