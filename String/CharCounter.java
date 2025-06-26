package String;

public class CharCounter {
    static void counting(String s){
            int vowels = 0, consonants = 0, whitespaces = 0;
            s=s.toLowerCase();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowels++;
                else if(ch>='b' && ch<='z') consonants++;
                else whitespaces++;

            }
        System.out.println(s);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White Spaces: " + whitespaces);
    }
     public static void main(String[] args) {
        String s = "hello idli dosa chatni chatni chatni";
        counting(s);
    }
}
