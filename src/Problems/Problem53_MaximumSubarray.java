package Problems;

public class Problem53_MaximumSubarray {

    public static int solution(int[] nums) {
        int sum = nums[0];
        int answer = nums[0];
        if (nums.length == 1) {
            return nums[0];
        }
        for (int j = 0; j < nums.length; j++) {
            sum = nums[j];
            int i  = j + 1;
            if (nums[j] > answer) {
                answer = sum;
            }
            while (i < nums.length) {
                sum = sum + nums[i];
                if (sum  > answer ) {
                    answer = sum;
                }
                i++;
            }
            sum = 0;
        }

        System.out.println(answer);
        return answer;
    }

}
