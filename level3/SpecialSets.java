import java.util.Scanner;

public class SpecialSets {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long result = countSpecialSets(N);
        System.out.println(result);
    }

    static long countSpecialSets(int N) {
        long[] dp = new long[N + 1];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i <= N; i++) {
			
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
			
        }

        long total= dp[N];
		
        for (int i = 1; i <= N - 1; i++) {
			
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
			
        }
        long conSet = dp[N - 1];
        total = (total - conSet + MOD) % MOD;

        return total;
    }
}
