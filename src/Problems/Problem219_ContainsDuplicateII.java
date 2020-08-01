package Problems;

import java.util.HashSet;

public class Problem219_ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<Integer> ();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] == nums[i]){
                        if (i-j <= k) {
                            return true;
                        }
                    }
                }
            }
            set.add(nums[i]);
        }
        return false;
    }

}
