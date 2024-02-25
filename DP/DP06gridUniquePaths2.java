package DP;

import java.util.Arrays;

public class DP06gridUniquePaths2 {

    // static int  solveUtil(int n,int m,int[][] arr, int[][] dp){
    //     if(n>=0 && m>=0 && arr[n][m]==-1){
    //         return 0;
    //     }
    //     if(n==0 && m==0) return 1;

    //     if(n<0 || m<0) return 0;


    //     if(dp[n][m]!=-1) return dp[n][m];

    //     int up =solveUtil(n-1, m, arr, dp);
    //     int left=solveUtil(n, m-1, arr, dp);

    //     return dp[n][m]=up+left;
    // }

    static int solve(int n,int m,int[][] arr){
        int[][] dp=new int[n][m];

        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
      return  solveUtil(n-1,m-1,arr,dp);
    }
    public static void main(String args[]){
        int[][] arr={
            {0,0,0},
            {0,-1,0},
            {0,0,0}
        };
        int n=arr.length;
        int m=arr[0].length;

        System.out.println(solve(n,m,arr));
    }


    static int solveUtil(int n,int m,int[][] arr,int[][] dp){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i>0 && j>0 && arr[i][j]==-1) {
                    dp[i][j]=0;
                    continue;
                }

                if(i==0&&i==0){
                    dp[i][j]=1;
                    continue;
                }

                int up =0;
                int left=0;
                if(i>0)
                    up=dp[i-1][j];

                if(j>0)
                    left=dp[i][j-1];

                dp[i][j]=up+left;
            }



        }
    
        return dp[n][m];
    }
}
