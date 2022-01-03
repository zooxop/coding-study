package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();  //입력받을 숫자의 개수
        int[] array = new int[count];   //입력받을 배열 동적 선언.

        //입력
        for(int i=0; i < count; i++){
            array[i] = scanner.nextInt();
        }

        //오름차순 정렬
        //Arrays.sort(array);

        //오름차순 정렬 (직접 구현)
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] > array[j]) { //오름차순
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        //StringBuilder를 사용하는것이 동작시간 측면에서 유리함.
        StringBuilder stringBuilder = new StringBuilder();
        for(int print :array){
            stringBuilder.append(print+"\n");
        }
        System.out.println(stringBuilder);
    }
}
