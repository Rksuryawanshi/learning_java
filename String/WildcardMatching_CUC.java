package String;

public class WildcardMatching_CUC {

    static boolean match(String first, String second) {
        // If both strings are empty
        if (first.isEmpty() && second.isEmpty()) {
            return true;
        }

        // Eliminate consecutive '*'s
        if (!first.isEmpty() && first.charAt(0) == '*') {
            int i = 1;
            while (i < first.length() && first.charAt(i) == '*') {
                i++;
            }
            first = first.substring(0, 1) + first.substring(i);
        }

        // If first is "*" but second is empty AND there's still something left in first
        if (!first.isEmpty() && first.charAt(0) == '*' && first.length() > 1 && second.isEmpty()) {
            return false;
        }

        // If characters match or first has '?'
        if (!first.isEmpty() && !second.isEmpty() &&
                (first.charAt(0) == '?' || first.charAt(0) == second.charAt(0))) {
            return match(first.substring(1), second.substring(1));
        }

        // If first has '*', check two possibilities:
        // 1. '*' matches current char in second → move second
        // 2. '*' matches nothing → move first
        if (!first.isEmpty() && first.charAt(0) == '*') {
            return match(first.substring(1), second) || 
                   (!second.isEmpty() && match(first, second.substring(1)));
        }

        return false;
    }

    static void test(String first, String second) {
        if (match(first, second)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        test("g*ks", "geeks");                  // Yes
        test("ge?ks*", "geeksforgeeks");        // Yes
        test("g*k", "gee");                     // No
        test("*pqrs", "pqrst");                 // No
        test("abc*bcd", "abcdhghgbcd");         // Yes
        test("abc*c?d", "abcd");                // No
        test("*c*d", "abcd");                   // Yes
        test("*?c*d", "abcd");                  // Yes
        test("geeks**", "geeks");              // Yes
    }
}
