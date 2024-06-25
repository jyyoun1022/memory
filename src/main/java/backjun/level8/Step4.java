package backjun.level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step4 {
    /**
     * 1- 9
     * 2 - 25
     * 5 - 1089
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rectPoint = 2;

        int M = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < M; i++) {
            rectPoint += (rectPoint - 1);
        }
        System.out.println(rectPoint * rectPoint);

    }
}
