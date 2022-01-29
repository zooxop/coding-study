package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9663 {
    public static int N;
    public static int[] arr;
    public static int count = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nQueen(0);
        System.out.print(count);
    }

    public static void nQueen(int depth){
        if (N == depth){
            count++;
            return;
        }

        for (int i=0; i < N; i++){
            arr[depth] = i;
            if (isPossibility(depth)){
                nQueen(depth + 1);
            }
        }
    }

    public static boolean isPossibility(int col){
        for (int i=0; i < col; i++){
            if (arr[col] == arr[i]){
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])){
                return false;
            }
        }
        return true;
    }
}
