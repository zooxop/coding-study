package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        int count = 0;

        for (int i=0; i < 10; i++){
            int remainder = Integer.parseInt(br.readLine()) % 42;
            if (!arr[remainder]) {
                arr[remainder] = true;
                count++;
            }
        }

        System.out.println(count);

    }
}
