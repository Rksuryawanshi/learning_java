package String;

/*unclear till now */
public class CommonSubseqCount_UC{

    public static int countCommonSubsequences(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        int[][] dp = new int[n1 + 1][n2 + 1];

        
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1];
                }
            }
        }

        return dp[n1][n2];
    }

    public static void main(String[] args) {
        String s = "ajblqcpdz";
        String t = "aefcnbtdi";
        System.out.println(countCommonSubsequences(s, t));
    }
}
