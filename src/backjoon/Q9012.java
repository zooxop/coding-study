package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9012 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());

        for (int i=0; i < cnt; i++){
            char[] temp = br.readLine().toCharArray();
            int bkt = 0;

            for (int j=0; j < temp.length; j++){
                if (Character.compare(temp[j],'(') == 0) bkt++;
                else bkt--;

                //삼항연산자
                //bkt = (Character.compare(temp[j], '(') == 0)? bkt+1 : bkt-1;
                if (bkt < 0) break;
            }

            if (bkt == 0) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.print(sb);
    }
}
