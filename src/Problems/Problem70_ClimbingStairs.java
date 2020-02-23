package Problems;

public class Problem70_ClimbingStairs {

    public int solution(int n) {
        int[] memo = new int[n+1];
        return recursion(0, n, memo);
    }

    public int recursion(int i, int j, int[] memo) {

        if (i > j) {
            return 0;
        }

        if (i == j) {
            return 1;
        }

        if (memo[i] > 0) {
            return memo[i];
        }

        memo[i] = recursion(i+1,j, memo) + recursion(i+2,j, memo);

        return memo[i];
    }
}
