package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2562 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 0;
        int max = 0;
        for (int i=0; i < 9; i++){
            int temp = Integer.parseInt(br.readLine());
            if (temp > max){
                max = temp;
                idx = i+1;
            }
        }
        System.out.print(max + "\n" + idx);
    }
}
