package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149 {
    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] cost = new int[N][3];

        for (int i=0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            cost[i][RED] = Integer.parseInt(st.nextToken());
            cost[i][GREEN] = Integer.parseInt(st.nextToken());
            cost[i][BLUE] = Integer.parseInt(st.nextToken());
        }

        // 1부터 N-1까지 각 i별 i-1의 서로 다른 색상 중 최솟값을 누적하여 더한다.
        for (int i=1; i < N; i++) {
            cost[i][RED] += Math.min(cost[i-1][GREEN], cost[i-1][BLUE]);
            cost[i][GREEN] += Math.min(cost[i-1][RED], cost[i-1][BLUE]);
            cost[i][BLUE] += Math.min(cost[i-1][RED], cost[i-1][GREEN]);
        }

        System.out.print(Math.min(Math.min(cost[N-1][RED], cost[N-1][GREEN]), cost[N-1][BLUE]));
    }
}
