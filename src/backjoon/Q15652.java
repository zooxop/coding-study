package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15652 {
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];

        dfs(1, 0);
        System.out.println(sb);
    }

    public static void dfs(int at, int depth){
        if (depth == M){
            for (int a : arr){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i=at; i <= N; i++){
            arr[depth] = i;
            dfs(i, depth+1);
        }
    }
}
