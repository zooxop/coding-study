package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828 {
    public static int[] stack;
    public static int size;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());

        stack = new int[cnt];
        size = 0;

        for (int i=0; i < cnt; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

            switch (stk.nextToken()){
                case "push" :
                    push(Integer.parseInt(stk.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append('\n');;
                    break;
                case "size" :
                    sb.append(size()).append('\n');;
                    break;
                case "empty" :
                    sb.append(empty()).append('\n');;
                    break;
                case "top" :
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int input){
        stack[size] = input;
        size++;
    }

    public static int pop(){
        if (size < 1) {
            return -1;
        } else {
            int i = stack[size-1];
            stack[size] = -1;
            size--;
            return i;
        }
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top(){
        if (size > 0) {
            return stack[size-1];
        } else {
            return -1;
        }
    }
}
