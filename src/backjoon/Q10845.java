package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q10845 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer stk;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<Integer>();
        int back = -1;

        for(int i = 0 ; i < cnt ; i ++) {
            stk = new StringTokenizer(br.readLine());
            switch(stk.nextToken()) {
                case "push":
                    back = Integer.parseInt(stk.nextToken());
                    queue.offer(back);
                    break;
                case "pop":
                    if(queue.isEmpty()) {
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty()? 1: 0).append("\n");
                    break;
                case "front":
                    sb.append(queue.isEmpty()? -1: queue.peek()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty()? -1: back).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
