package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8958 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0; i < count; i++){
            String input = br.readLine();
            String[] temp = input.split("");
            int score = 0;
            int now = 0;
            for (int j=0; j < temp.length; j++){
                if (temp[j].equals("O")){
                    now++;
                    score += now;
                } else {
                    now = 0;
                }
            }
            sb.append(score).append("\n");
        }

        System.out.print(sb);
    }
}
