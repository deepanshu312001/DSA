package DP;

public class DP07minimumPathSumGrid {



// static int solveUtil(int n,int m ,int[][] arr,int[][] dp){
//     if(n==0&&m==0) return arr[n][m];

//     if(n<0 || m<0) return (int) Math.pow(10, 9);

//     if(dp[n][m]!=-1) return dp[n][m];

//     int up =arr[n][m]+solveUtil(n-1, m, arr, dp);
//     int left=arr[n][m]+solveUtil(n, m-1, arr, dp);

//     return dp[n][m]=Math.min(up, left);
// }

//     static int solve(int n,int m,int[][] arr){
//         int[][] dp =new int[n][m];

//         for(int[] row: dp){
//             Arrays.fill(row,-1);
//         }


//         return solveUtil(n-1,m-1,arr,dp);

//     }
    public static void main(String args[]){
        int[][] arr={
            {5,9,6},
            {11,5,2}
        };

        int n=arr.length;
        int m=arr[0].length;


        System.out.println(solve(n,m,arr));
    }




    static int  solve(int n,int m,int[][] arr){
        int[][] dp = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0 ;j<m;j++){
                if(i==0&& j==0) {
                    dp[i][j]=arr[i][j];
                }else{
                    int up =arr[i][j];
                    if(i>0){
                        up+=dp[i-1][j];
                    }else{
                        up+=(int) Math.pow(10, 9);
                    }
                    int left =arr[i][j];

                    if(j>0){
                        left+=dp[i][j-1];
                    }else{
                        left+=(int) Math.pow(10, 9);
                    }

                    dp[i][j] =Math.min(left,up);
                }
            }
        }

        return dp[n-1][m-1];
    }

}
