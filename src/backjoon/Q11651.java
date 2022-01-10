package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11651 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        int[][] arr = new int[cnt][2];

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //Comparator
        Arrays.sort(arr, (e1, e2) -> {
            //e1 = arr[n][0..1], e2 = arr[n+1][0..1]
            if(e1[1] == e2[1]) {  //y 원소가 같다면
                return e1[0] - e2[0];  //x 원소 기준 오름차순
            } else {
                return e1[1] - e2[1];  //y 원소 기준 오름차순
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<cnt; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}
