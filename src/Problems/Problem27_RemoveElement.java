package Problems;

import java.util.Arrays;

public class Problem27_RemoveElement {

    public static int solution(int[] nums, int val) {

        int j = 0;

        for(int i = 0; i < nums.length; i++ ) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }

        System.out.println(j);
        System.out.println(Arrays.toString(nums));
        return j;
    }

}
