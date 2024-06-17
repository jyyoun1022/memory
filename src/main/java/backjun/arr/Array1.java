package backjun.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array1 {

//    총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int result = 0;

        String find = br.readLine();

        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals(find)) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
