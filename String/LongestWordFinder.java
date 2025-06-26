package String;



public class LongestWordFinder {
    static int findLongestWord(String str, StringBuilder maxWord) {
        int maxLen = 0, left = 0, index = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                int tmp = i - left;
                if (tmp > maxLen) {
                    maxLen = tmp;
                    index = left;
                }
                left = i + 1; 
            }
        }

        maxWord.append(str.substring(index, index + maxLen));
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "hello, gen G generation ";
        StringBuilder maxWord = new StringBuilder();
        int size = findLongestWord(str, maxWord);
        System.out.println("Largest Word is: " + maxWord + " and its length is " + size);
    }
}
