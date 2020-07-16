package Problems;

public class Problem189_RotateArray {

    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        while (k >0) {
            temp[0] = nums[nums.length-1];
            for (int i = 1; i < nums.length; i++) {
                temp[i] = nums[i-1];
            }
            for (int i=0; i < nums.length ; i++) {
                nums[i] = temp[i];
            }
            k--;
        }

    }

}
