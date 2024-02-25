package DP;

public class DP04ninjaTraining {

    // static int solveUtil(int day, int lastDay, int[][] points, int[][] dp) {
    //     if (dp[day][lastDay] != -1)
    //         return dp[day][lastDay];
    //     if (day == 0) {
    //         int maxi = 0;
    //         for (int i = 0; i <= 2; i++) {
    //             if (i != lastDay) {
    //                 maxi = Math.max(maxi, points[0][i]);
    //             }
    //         }
    //         return dp[day][lastDay] = maxi;
    //     }
    //     int maxi = 0;

    //     for (int i = 0; i <= 2; i++) {
    //         if (i != lastDay) {
    //             int activity = points[day][i] + solveUtil(day - 1, i, points, dp);
    //             maxi = Math.max(maxi, activity);
    //         }
    //     }
    //     return dp[day][lastDay]=maxi;
    // }

    // static int solve(int[][] points, int n) {
    //     int[][] dp = new int[n][4];
    //     for (int[] row : dp) {
    //         Arrays.fill(row, -1);
    //     }

    //     return solveUtil(n - 1, 3, points, dp);
    // }

    public static void main(String args[]) {
        int[][] points = { { 10, 40, 70 },
                { 20, 50, 80 },
                { 30, 60, 90 } };
        int n = points.length;

        // System.out.println(solve(points, n));

        System.out.println(solve(n,points));
    }

    static int solve(int n,int[][] points){
        int[][] dp=new int[n][4];


        dp[0][0]=Math.max(points[0][1],points[0][2]);
        dp[0][1]=Math.max(points[0][0],points[0][2]);
        dp[0][2]=Math.max(points[0][0],points[0][2]);
        dp[0][3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));

        for(int day=1;day<n;day++){
            for(int last=0;last<4;last++){
                dp[day][last]=0;

                for(int task=0;task<=2;task++){
                    if(task!=last){
                        int activity=points[day][task]+dp[day-1][task];
                        dp[day][last]=Math.max(dp[day][last], activity);
                    }
                }
            }
        }

        return dp[n-1][3];


    }
}
