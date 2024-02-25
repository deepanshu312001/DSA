package DP;

import java.util.Arrays;

public class DP03MaximumSumofNonAdjacentElements {

    // static int solveUtil(int[] arr,int n,int[] dp){
    //     if(n<0) return 0;

    //     if(n==0) return arr[n];

    //     if(dp[n]!=-1) return  dp[n];

    //     int pick=arr[n]+solveUtil(arr, n-2, dp);
    //     int notPick=solveUtil(arr, n-1, dp);

    //     return dp[n]=Math.max(pick, notPick);


    // }

    static int solveUtil(int[] arr,int n,int[] dp){
        dp[0]=arr[0];
        for(int i=1;i<n;i++){
            int pick=arr[i];
            if(i>1){
                pick+=dp[i-2];
            }
            int notPick=dp[i-1];
            dp[i]=Math.max(pick, notPick);
        }
        return dp[n-1];
    }

    static int solve(int[] arr,int n){
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solveUtil(arr,n,dp); // return solveUtil(arr,n-1,dp);
    }
    public static void main(String args[]){
        int arr[]={2,1,4,9};
        int n= arr.length;
        int result=solve(arr,n);
        System.out.println(result);
    }
    
}
