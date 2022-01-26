package backjoon.q16193;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q16193 {
    public static void main(String[] args) throws Exception{

        // 5
        // 5 10 12 17 19

        // 12 19 5 17 10 = 7+14+12+7 = 21+12 = 33
        // 12 5 19 10 17 = 7+14+9+7

        //1. 입력받은 배열(arr)을 오름차순 정렬.
        //2. 같은 크기의 텅 빈 배열(newArr)을 새로 선언 후, 배열의 중간값을 가져와서 newArr[0]에 대입.
        //3.1 newArr[0]값과 arr의 가장 큰 값을 뺀 값의 절댓값 도출.
        //3.2 newArr[0]값과 arr의 가잔 작은 값을 뺀 값의 절댓값 도출.
        //4. "3.1"과 "3.2"를 비교하여, 더 큰 값을 도출해내는 결과를 newArr[1]에 대입.
        //5. answer[0]에 newArr[0]-newArr[1]의 절대값을 대입.
        // 3.1 ~ 5 의 과정 반복.
        //6. answer 배열의 모든 값을 더한 뒤 출력.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        ArrayList<Long> arr = new ArrayList<>();
        ArrayList<Long> newArr = new ArrayList<>();
        ArrayList<Long> newArr2 = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i < cnt; i++){
            arr.add(Long.parseLong(st.nextToken()));
        }

        Collections.sort(arr);  //..1

        Deque<Long> dq = new ArrayDeque<>();
        Deque<Long> dq2 = new ArrayDeque<>();
        for (int i=0; i < arr.size(); i++){
            if (i == (cnt/2)) {
                newArr.add(arr.get(i));  //..2
                newArr2.add(arr.get(i));
            } else {
                dq.offer(arr.get(i));
                dq2.offer(arr.get(i));
            }
        }
        //13
        //1 2 3 4 5 6 9 10 -8 100 20 35 89
        //5
        //6 -8 100 1 89
        //6 100 -8 89 1
        //94+108+97+88




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
//        System.out.print("newArr : ");
//        for(int idx=0; idx<newArr.size(); idx++){
//            System.out.print(newArr.get(idx) + " ");
//        }
//        System.out.print("sum : " + sum);
//        System.out.println();

        //6 100 -8 89

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


//
//        System.out.print("newArr2 : ");
//        for(int idx=0; idx<newArr2.size(); idx++){
//            System.out.print(newArr2.get(idx) + " ");
//        }
//        System.out.print("sum2 : " + sum2);
//        System.out.println();

        if (sum > sum2) {
            System.out.print(sum);
        } else {
            System.out.print(sum2);
        }
    }
}
