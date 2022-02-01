package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        int[] count = new int[10];

        for (int i=0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        String[] rslt = Long.toString(arr[0] * arr[1] * arr[2]).split("");

        for (int i=0; i < rslt.length; i++){
            count[Integer.parseInt(rslt[i])]++;
        }

        for (int a : count){
            System.out.println(a);
        }
    }
}
