package backjoon.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class recursiveStudy {
    //재귀함수 공부,연습
    //1부터 N까지의 합을 구하는 함수를 재귀로 구현

    public static int sum = 0;
    public static int i=1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int val = mySum(N);
        System.out.print(val);
    }

    public static int mySum(int N){
        if (i <= N){
            sum += i++;
            return mySum(N);
        } else {
            return sum;
        }
    }
}
