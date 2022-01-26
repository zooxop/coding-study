package backjoon.q16193;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q16193_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        LinkedList<Long> arr = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i < cnt; i++){
            arr.add(Long.parseLong(st.nextToken()));
        }
        Collections.sort(arr);

        Deque<Long> deqArr = arr;
        Deque<Long> deqRes = new LinkedList<>();
        deqRes.add(deqArr.pollLast());

        long result = 0;

        for (int i=0; i < cnt-1; i++){
            ArrayList<Long> maxList = new ArrayList<>();
            maxList.add(Math.abs(deqArr.peekLast() - deqRes.peekLast()));
            maxList.add(Math.abs(deqArr.peekLast() - deqRes.peekFirst()));
            maxList.add(Math.abs(deqArr.peekFirst() - deqRes.peekLast()));
            maxList.add(Math.abs(deqArr.peekFirst() - deqRes.peekFirst()));
            Long m = Collections.max(maxList);

            if (m == maxList.get(0)) {
                result += maxList.get(0);
                deqRes.add(deqArr.pollLast());
            } else if (m == maxList.get(1)) {
                result += maxList.get(1);
                deqRes.offerFirst(deqArr.pollLast());
            } else if (m == maxList.get(2)) {
                result += maxList.get(2);
                deqRes.add(deqArr.pollFirst());
            } else {
                result += maxList.get(3);
                deqRes.offerFirst(deqArr.pollFirst());
            }
        }

        System.out.print(result);

    }
}
