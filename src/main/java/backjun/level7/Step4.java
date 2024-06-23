package backjun.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        boolean[][] arr = new boolean[100][100];

        int M = Integer.parseInt(br.readLine());


        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int maxX = Integer.parseInt(st.nextToken());
            int maxY = Integer.parseInt(st.nextToken());

            for (int x = maxX; x < maxX + 10; x++) {
                for (int y = maxY; y < maxY + 10; y++) {
                    if (!arr[x][y]) {
                        arr[x][y] = true;
                    }
                }
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
