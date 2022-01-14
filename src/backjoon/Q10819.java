package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q10819 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> newArr = new ArrayList<>();
        ArrayList<Integer> newArr2 = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i < cnt; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);  //..1

        Deque<Integer> dq = new ArrayDeque<>();
        Deque<Integer> dq2 = new ArrayDeque<>();
        for (int i=0; i < arr.size(); i++){
            if (i == (cnt/2)) {
                newArr.add(arr.get(i));  //..2
                newArr2.add(arr.get(i));
            } else {
                dq.offer(arr.get(i));
                dq2.offer(arr.get(i));
            }
        }

        int i=0;
        int sum = 0;
        while(!dq.isEmpty()){
            if (i%2==0){
                newArr.add(dq.peekFirst());
                sum += Math.abs(newArr.get(i) - dq.pollFirst());
            } else {
                newArr.add(dq.peekLast());
                sum += Math.abs(newArr.get(i) - dq.pollLast());
            }
            i++;
        }

        i=0;
        int sum2 = 0;
        while(!dq2.isEmpty()){
            if (i%2==0){
                newArr2.add(dq2.peekLast());
                sum2 += Math.abs(newArr2.get(i) - dq2.pollLast());
            } else {
                newArr2.add(dq2.peekFirst());
                sum2 += Math.abs(newArr2.get(i) - dq2.pollFirst());
            }
            i++;
        }

        if (sum > sum2) {
            System.out.print(sum);
        } else {
            System.out.print(sum2);
        }
    }
}
