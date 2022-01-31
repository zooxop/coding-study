package backjoon.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NnMSample {
    public static StringBuilder sb = new StringBuilder();
    public static int[] arr;
    public static int N, M;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth){
        if (M == depth){
            for (int i=0; i < arr.length; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=0; i < N; i++){
            arr[depth] = i+1;
            dfs(depth+1);
        }
    }
}
