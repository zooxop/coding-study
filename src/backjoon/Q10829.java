package backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10829 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        decToBin(N);
        bw.write(String.valueOf(sb.reverse()));
        bw.flush();
        bw.close();
    }

    public static Long decToBin(long num){
        long remainder = 0;
        if (num >= 2){
            remainder = num%2;
            sb.append(remainder);
            return decToBin(num/2);
        } else {
            remainder = num%2;
            sb.append(remainder);
            return num;
        }
    }
}
