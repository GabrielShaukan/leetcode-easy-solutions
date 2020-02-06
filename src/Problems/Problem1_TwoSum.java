package Problems;

public class Problem1_TwoSum {

    public static int[] solution(int[] nums, int target) {

        int length = nums.length;
        int sum = 0;
        int[] location = new int[]{};

        for (int i = 0; i<length; i++) {
            for(int j=i+1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    location = new int[]{i, j};
                }
            }
        }
        return location;
    }
}
