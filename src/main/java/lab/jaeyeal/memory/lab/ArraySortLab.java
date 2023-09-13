package lab.jaeyeal.memory.lab;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortLab {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 9, 3, 6};

        // Sort arrays in ascending order
        Arrays.sort(arr);
        for (int num : arr) {
            // Array Output Sorted in ascending order
            System.out.print(num);
        }
        System.out.println();
        // Sort arrays in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        for (int num : arr) {
            // Array output sorted in descending order
            System.out.print(num);
        }

        System.out.println();

        // How not to import an java.util.Array
        int[] newArr = new int[10];
        int changeCnt = 0;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (int)(Math.random()* 10);
        }

        for (int i = 0; i < newArr.length-1; i++) {
            // Check if there is a change of seats
            boolean changed = false;

            for (int j = 0; j < newArr.length-1-i; j++) {
                if (newArr[j] > newArr[j+1]) { // If the value next to it is small, switch it with each other.
                    int temp = newArr[j];
                    newArr[j] = newArr[j+1];
                    newArr[j+1] = temp;
                    changed = true;
                    changeCnt++;
                }
            }
            if(!changed) break;
        }
        System.out.println("changeCnt = " + changeCnt);
        System.out.println(Arrays.toString(newArr));
    }
}
