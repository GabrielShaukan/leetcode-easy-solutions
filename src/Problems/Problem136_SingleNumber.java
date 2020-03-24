package Problems;

public class Problem136_SingleNumber {

    public int singleNumber(int[] nums) {
        int holder = 0;
        int counter = 0;

        for(int i=0; i<nums.length; i++) {
            holder = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (holder == nums[j]) counter++;
            }
            if (counter == 1) break;
            counter = 0;
        }

        return holder;
    }

}
