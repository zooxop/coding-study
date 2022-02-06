package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1065 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(arithmetic(Integer.parseInt(br.readLine())));
    }

    public static int arithmetic(int val){
        if (val < 100){
            return val;
        } else {
            if (val == 1000) val--;
            int count = 99;
            for(int i=100; i <= val; i++){
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun-ten) == (ten-one)){
                    count++;
                }
            }
            return count;
        }
    }
}
