package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step5 {
    /**
     * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
     */
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 65]++;
        }
        int max = -1;
        char result = '?';

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                result = (char)(i + 65);
            } else if (max == arr[i]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
