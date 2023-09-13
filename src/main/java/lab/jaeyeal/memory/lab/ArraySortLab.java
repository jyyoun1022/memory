package lab.jaeyeal.memory.lab;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortLab {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 3, 6};

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);
        for (int num : arr) {
            // 정렬된 배열 출력
            System.out.print(num);
        }
        System.out.println();
        // 배열을 내림차순으로 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        for (int num : arr) {
            //내림차순으로 정렬된 배열 출력
            System.out.print(num);
        }
    }
}
