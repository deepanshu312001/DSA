import java.util.Arrays;

class FibonacciNumber {
    static int NthFibo(int[] dp, int n) {
        if (n <= 1) return n;

        if (dp[n] != -1) return dp[n];
        
        return dp[n] = NthFibo(dp, n - 1) + NthFibo(dp, n - 2);
    }

    public static void main(String args[]) {
        int n = 10;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(NthFibo(dp, n));
    }
}
