package Problems;

public class Problem169_MajorityElement {

    public int majorityElement(int[] nums) {
        int limit = (int) Math.ceil(nums.length/2.0);
        int a = 0;
        int mem = 0;
        int answer = 0;
        for (int i = 0; i < nums.length; i++){
            if (mem == nums[i]) continue;
            mem = nums[i];
            for (int j =0; j< nums.length; j++) {
                if (mem == nums[j]) a++;
            }
            if (a >= limit) { answer = mem;}
            a = 0;
        }
        return  answer;
    }

}
