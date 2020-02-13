package Problems;

public class Problem26_RemoveDuplicatesFromSortedArray {

    public int solution(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int answer = 1;

        for (int i = 0 ; i < nums.length ; i++) {
            if (i+1 < nums.length) {
                if (nums[i] == nums[i+1]) {
                } else {
                    answer++;
                    nums[answer -1] = nums[i+1];
                }
            } else {
                if (nums[i] == nums[i-1]) {
                } else {
                    nums[answer -1] = nums[i];
                }
            }

        }

        if (nums.length == 0) {
            System.out.println(0);
            return 0;
        } else {
            System.out.println(answer);
            return answer;
        }

    }

}
