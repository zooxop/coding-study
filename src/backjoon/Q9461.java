package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9461 {
    public static long[] arr = new long[101];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;

        for (int i=4; i < arr.length; i++){
            arr[i] = -1;
        }

        for (int i=0; i < cnt; i++){
            int input = Integer.parseInt(br.readLine());
            sb.append(dp(input)).append("\n");
        }

        System.out.print(sb);
    }

    public static long dp(int n){
        if (arr[n] == -1){
            arr[n] = dp(n-2) + dp(n-3);
        }

        return arr[n];
    }
}
