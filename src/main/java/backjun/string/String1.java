package backjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1 {
    /**
     * 단어 S 와 i가 주어졌을 떄 S의 i 번쨰 글짜를 출력하는 프로그램을 작성
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();

        int n = Integer.parseInt(br.readLine())-1;

        br.close();

        System.out.println(st.charAt(n));

    }
}
