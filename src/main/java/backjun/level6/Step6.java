package backjun.level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        br.close();

        String[] croatiaAlphabet ={"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String cro : croatiaAlphabet) {
            if (str.contains(cro)) {
                str = str.replace(cro, "A");
            }
        }
        System.out.println(str.length());
    }
}
