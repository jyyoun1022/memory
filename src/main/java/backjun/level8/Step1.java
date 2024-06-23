package backjun.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step1 {
    /**
     * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
     * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
     * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
     *
     *
     * ZZZZZ 36
     * 60466175
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int temp = 1;
        int answer = 0;

        for (int i = N.length() - 1; i >= 0; i--) {
            char ch = N.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                answer += (ch - 'A' + 10) * temp;
            } else {
                answer += (ch - '0') * temp;
            }
            temp *= B;
        }
        System.out.println(answer);
    }
}
