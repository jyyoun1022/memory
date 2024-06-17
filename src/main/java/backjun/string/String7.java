package backjun.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String7 {
    /**
     * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
     * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
     *
     * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] arr = br.readLine().split(" ");
            int loopCount = Integer.parseInt(arr[0]);
            String value = arr[1];

            for (int j = 0; j < value.length(); j++) {
                for (int k = 0; k < loopCount; k++) {
                    char ch = value.charAt(j);
                    sb.append(ch);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
