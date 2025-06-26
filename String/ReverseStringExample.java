package String;

public class ReverseStringExample {
    static String manualReverse(String str){
        String result=new String();
        for(int i=0;i<str.length();i++){
            result+=str.charAt(str.length()-i-1);
        }
        return result;
    }
    

    static String reverseUsingLibrary(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        String str = "rahul kumar";

        System.out.println("Manual Reverse: " + manualReverse(str));
        System.out.println("Library Reverse: " + reverseUsingLibrary(str));
    }
}
