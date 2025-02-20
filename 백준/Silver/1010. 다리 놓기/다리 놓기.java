import java.io.*;
import java.util.*;

public class Main {
    static int dp[][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        dp = new int[30][30];

        for(int i = 0; i < 30; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for(int i = 2; i < 30; i++) {
            for(int j = 1; j < 30; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(dp[M][N]).append("\n");
        }
        System.out.print(sb);
    }
}