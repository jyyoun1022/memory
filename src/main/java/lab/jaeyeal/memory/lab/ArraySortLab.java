package lab.jaeyeal.memory.lab;

import java.util.Arrays;

public class ArraySortLab {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 6};

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);
        for (int num : arr) {

            // 정렬된 배열 출력
            System.out.print(num);
        }
    }



    }

    // 배열을 내림차순으로 정렬하려면 다음과 같이 사용합니다.
    // Arrays.sort(arr, Collections.reverseOrder());

    // 내림차순으로 정렬된 배열 출력
    // System.out.println("\n내림차순 정렬:");
    // for (int num : arr) {
    //     System.out.print(num + " ");
    // }
