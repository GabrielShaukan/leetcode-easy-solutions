package Problems;

import java.util.HashSet;

public class Problem202_HappyNumber {


    public boolean isHappy(int n) {

        HashSet<Integer> seen = new HashSet<>();

        while (n != 1) {
            int current =n ;
            int sum = 0;

            while (current != 0) {
                sum += Math.pow(current % 10,2);
                current /= 10;
            }
            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            n = sum;
            System.out.println(n);
        }
        return true;
    }

}
