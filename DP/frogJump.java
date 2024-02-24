package DP;

import java.util.Arrays;

public class frogJump {
    

    // static int solve(int n,int[] height,int[] dp){
    //     if (n==0) return 0;
    //     if(dp[n]!=-1) return dp[n];
    //     int jumpTwo=Integer.MAX_VALUE;
    //     int jumpOne=solve(n-1, height, dp)+Math.abs(height[n]-height[n-1]);
    //     if(n>1)
    //         jumpTwo=solve(n-2,height,dp)+Math.abs(height[n]-height[n-2]);

    //     return dp[n]=Math.min(jumpOne,jumpTwo);
    
    // }

    // public static void  main(String args[]){
    //     int height[]={30,10,60 , 10 , 60 , 50};

    //     int n=height.length;
    //     int dp[]=new int[n];
    //     Arrays.fill(dp,-1);
    //     System.out.println(solve(n-1,height,dp));
    // }

    public static void main(String args[]){
        int height[]={30,10,60,10,60,50};

        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int ind=1;ind<n;ind++){
            int jumpTwo=Integer.MAX_VALUE;
            int jumpOne=dp[ind-1]+Math.abs(height[ind]-height[ind-1]);
            if(ind>1) 
            jumpTwo=dp[ind-2]+Math.abs(height[ind]-height[ind-2]);

            dp[ind]=Math.min(jumpTwo,jumpOne);
        }
        System.out.println(dp[n-1]);
    }
}
