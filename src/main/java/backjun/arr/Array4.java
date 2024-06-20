package backjun.arr;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Array4 {
    /**
     *   현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다. 또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
     * 도현이는 앞으로 M번 공을 넣으려고 한다. 도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다. 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
     * 공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
