package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10866 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();

        for (int i=0; i < cnt; i++){
            stk = new StringTokenizer(br.readLine(), " ");

            switch (stk.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(stk.nextToken()));
                    break;

                case "push_back":
                    deque.addLast(Integer.parseInt(stk.nextToken()));
                    break;

                case "pop_front":
                    sb.append(deque.isEmpty()? -1: deque.pollFirst()).append("\n");
                    break;

                case "pop_back":
                    sb.append(deque.isEmpty()? -1: deque.pollLast()).append("\n");
                    break;

                case "size":
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty":
                    sb.append(deque.isEmpty()? 1: 0).append("\n");
                    break;

                case "front":
                    sb.append(deque.isEmpty()? -1: deque.peekFirst()).append("\n");
                    break;

                case "back":
                    sb.append(deque.isEmpty()? -1: deque.peekLast()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
