package Problems;

public class Problem172_FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int answer = 0;
        while  (n > 0) {
            n = n/5;
            if (n > 0) {answer += n;}
        }
        return answer;
    }
}
