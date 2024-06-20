package backjun.arr;

import java.io.*;
import java.util.StringTokenizer;

public class Array2 {
    /**
     *  정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0 ; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            if (value < X) {
                sb.append(value).append(" ");
            }
        }
        System.out.println(sb);
    }
}
