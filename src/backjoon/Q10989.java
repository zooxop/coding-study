package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10989 {
    public static void main(String[] args) throws Exception {
        // 카운팅 정렬 => 입력받을 숫자의 최소~최대 범위를 알고 있을 때 사용하면 빠른 성능을 기대할 수 있음.
        // 입력받을 수의 범위 : 1 ~ 10000
        int[] arr = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for (int i=0; i < cnt; i++) {
            //입력받은 숫자에 해당하는 인덱스 공간에 +1을 시켜준다.
            //ex) 7 입력 => arr[7] = arr[7]+1;
            arr[Integer.parseInt(br.readLine())] ++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        //0은 입력 안받음.
        for(int i = 1; i <= 10000; i++){
            // arr[i]의 수만큼 i 값을 출력한다.
            while(arr[i] > 0){
                sb.append(i).append('\n');
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}
