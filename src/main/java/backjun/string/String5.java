package backjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String5 {
    /**
     * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
     * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int count = Integer.valueOf(str);

        String value = br.readLine();
        br.close();

        int result = 0;

        for (int i = 0; i < count; i++) {
            result += value.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
