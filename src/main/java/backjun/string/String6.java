package backjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String6 {
    /**
     * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
     * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
     * - 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] result = new int[26];
        Arrays.fill(result, -1);

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i) - 'a';

            if (result[ch] == -1) {
                result[ch] = i;
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
