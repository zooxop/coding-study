package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1932 {
    public static int[][] arr;
    public static int[][] dp;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        dp = new int[N][N];

        for (int i=0; i < N; i++){
            for (int j=0; j < N; j++){
                arr[i][j] = -1;
                dp[i][j] = -1;
            }
        }

        //입력
        for (int i=0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int j=0;
            while(st.hasMoreTokens()){
                arr[i][j] = Integer.parseInt(st.nextToken());
                j++;
            }
        }

        //dp의 마지막 줄에 arr의 마지막줄 내용을 복사.
        for (int i=0; i < N; i++){
            dp[N-1][i] = arr[N-1][i];
        }

        for (int i=N-2; i >= 0; i--){
            for (int j=i; j >= 0; j--){
                dp[i][j] = Math.max(arr[i][j] + dp[i+1][j], arr[i][j] + dp[i+1][j+1]);
            }
        }
        System.out.print(dp[0][0]);
    }
}
