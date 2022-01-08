package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q11650 {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        //2차원 배열로 입력을 받음
        int[][] arr = new int[cnt][2];

        for(int i = 0; i < cnt; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        //Comparator
        Arrays.sort(arr, (e1, e2) -> {
            //e1 = arr[n][0..1], e2 = arr[n+1][0..1]
            if(e1[0] == e2[0]) {  //x 원소가 같다면
                return e1[1] - e2[1];  //y 원소 기준 오름차순
            } else {
                return e1[0] - e2[0];  //x 원소 기준 오름차순
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cnt; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb);
    }*/

    //메모리/속도 개선버전
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        long[] xy = new long[N];
        long tot = 1000000;
        long check = 100000;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Integer.parseInt(st.nextToken()) + check;
            long y = Integer.parseInt(st.nextToken()) + check;
            xy[i] = (x * tot + y);
        }
        Arrays.sort(xy);
        for(int i=0; i<N; i++) {
            sb.append(String.valueOf((xy[i] / tot) - check) +" " + String.valueOf((xy[i] % tot) - check)).append("\n");
        }
        System.out.print(sb);
    }

}
