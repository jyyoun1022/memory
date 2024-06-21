package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step4 {
    /**
     * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
     * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
     * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
     */
    public static void main(String[] args) throws IOException {
        int result = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        String[] arr = str.split("");

        for (int i = 0; i < arr.length / 2; i++) {
            if (!arr[i].equals(arr[arr.length - i - 1])) {
                result = 0;
            }
        }
        System.out.println(result);

    }
}
