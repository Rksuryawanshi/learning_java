package String;

public class PalindromeCheck {
    static Boolean palindrome(int i,String s){
        if(i>=s.length()) return true;

        if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        
        return palindrome(++i,s);
    }
    static String isPalindrome(String st) {
        int left = 0, right = st.length() - 1;

        while (left < right) {
            char l = st.charAt(left);
            char r = st.charAt(right);

            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return "not pal";
            } else {
                left++;
                right--;
            }
        }
        return "pal";
    }
     public static void main(String[] args) {
        String s = "madam";
        System.out.println(palindrome(0, s));
    }
}
