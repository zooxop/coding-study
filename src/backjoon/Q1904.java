package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1904 {
    public static int[] dp = new int[1000001];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i < dp.length; i++){
            dp[i] = -1;
        }

        System.out.println(Tile(Integer.parseInt(br.readLine())));
    }

    public static int Tile(int N){
        if(dp[N] == -1){
            dp[N] = (Tile(N-1) + Tile(N-2)) % 15746;
        }
        return dp[N];
    }
}
