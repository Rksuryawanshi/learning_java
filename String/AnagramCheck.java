package String;

public class AnagramCheck {
    static Boolean angm(String str1,String str2){
        if(str1.length()!=str2.length()) return false;

        int[] freq=new int[26];
        for(int i=0;i<str1.length();i++) freq[str1.charAt(i)-'a']++;

        for (int i = 0; i < str2.length(); i++)
            freq[str2.charAt(i) - 'a']--;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ellom";

        if (angm(str1, str2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
