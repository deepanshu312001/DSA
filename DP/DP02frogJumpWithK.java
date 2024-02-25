package DP;

import java.util.Arrays;

public class DP02frogJumpWithK {

    // static int solveUtil(int n,int[] height,int k,int[] dp){
    // if(n==0) return 0;
    // if(dp[n]!=-1) return dp[n];
    // int mnSteps=Integer.MAX_VALUE;
    // for (int j=1;j<=k;j++){
    // if(n-j>=0){
    // int jump=solveUtil(n-j, height, k, dp)+Math.abs(height[n]-height[n-j]);
    // mnSteps=Math.min(mnSteps, jump);
    // }
    // }
    // return dp[n]=mnSteps;
    // }

    static int solve(int n, int[] height, int k) {
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return solveUtil(n , height, k, dp); 
        // return solveUtil(n - 1, height, k, dp);
    }

    public static void main(String args[]) {
        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        int k = 2;
        System.out.println(solve(n, height, k));
    }

    static int solveUtil(int n, int[] height, int k, int[] dp) {
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int mnSteps = Integer.MAX_VALUE;

            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    mnSteps = Math.min(mnSteps, jump);
                }

            }
            dp[i] = mnSteps;
        }
        return dp[n - 1];
    }

}
