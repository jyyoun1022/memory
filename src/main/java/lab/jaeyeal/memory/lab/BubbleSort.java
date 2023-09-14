package lab.jaeyeal.memory.lab;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numberArr = {5,8,9,54,7,1,23};
        int[] result = bubbleSort(numberArr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] a) {
        return bubbleSort(a,a.length);
    }
    public static int[] bubbleSort(int[] a, int size) {
        for (int i = 1; i < size; i++) {
            boolean changed = false;

            for (int j=0; j < size -i; j++) {
                if(a[j] > a [j + 1]) {
                    swap(a, j, j + 1);
                    changed = true;
                }
            }
            if (changed == false) {
                break;
            }
        }
        return a;
    }

    private static void swap(int[] a, int i , int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
