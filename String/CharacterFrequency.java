package String;

import java.util.Arrays;

public class CharacterFrequency {

    static void printFrequency(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);  

        int count = 0;
        char ch = chars[0];

        for (char c : chars) {
            if (c == ch) {
                count++;
            } else {
                System.out.println(ch + "" + count);
                ch = c;
                count = 1;
            }
        }

        
        System.out.println(ch + "" + count);
    }

    public static void main(String[] args) {
        String str = "rahulrABR";
        printFrequency(str);
    }
}

