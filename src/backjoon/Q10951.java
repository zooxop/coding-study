package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10951 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        StringBuilder sb = new StringBuilder();

        while((input = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(input, " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}
