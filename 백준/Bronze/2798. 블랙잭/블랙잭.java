import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // 카드 개수
        int M = Integer.parseInt(st.nextToken()); // 합의 최댓값
        int cardArr[] = new int[N];
        int blackJackNum = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num <= M){
                cardArr[i] = num;
            }
        }
        Arrays.sort(cardArr);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(cardArr[i] + cardArr[j] < M){
                    for(int k = 0; k < N; k++){
                        if(i != j && j != k && k != i){
                            int sum = cardArr[i] + cardArr[j] + cardArr[k];
                            if((sum <= M) && (sum > blackJackNum)) {
                                blackJackNum = sum;
                            }
                        }
                    }
                }
            }
        }
        sb.append(blackJackNum);
        System.out.print(sb);
    }
}