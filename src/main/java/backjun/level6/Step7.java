package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step7 {
    /**
     * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
     * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
     * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
     * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int M = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i < M; i++) {
            if (check()) {
                result++;
            }
        }
        System.out.println(result);
    }
    public static boolean check() throws IOException{
        boolean[] checkArr = new boolean[26];
        int prev = -1;
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i) - 'a';    // i 번째 문자 저장(현재문자)
            if (prev != now) {
                if (!checkArr[now]) {
                    prev = now;
                    checkArr[now] = true;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }

}
