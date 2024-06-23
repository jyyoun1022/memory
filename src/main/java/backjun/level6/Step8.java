package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] gradeArr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] scoreArr = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};


        double sumScore = 0.0;
        int calCount = 0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String subject = st.nextToken();
            Double value = Double.valueOf(st.nextToken());
            String grade = st.nextToken();

            for (int j = 0; j < 9; j++) {
                if (gradeArr[j].equals(grade)) {
                    sumScore += scoreArr[j] * value;
                    calCount += value;
                }
            }
        }

        System.out.println(sumScore / calCount);
    }
}
