package Problems;

public class Problem66_PlusOne {

    public int[] solution(int[] nums) {

        int[] answer = new int[nums.length+1];
        nums[nums.length - 1] = nums[nums.length - 1] +1 ;

        for (int i = 1; i < nums.length; i++) {
            if(nums[nums.length - i] == 10) {
                nums[nums.length -i] = 0;
                nums[nums.length - i - 1] += 1;
            }
        }


        if(nums[0] == 10) {
            answer[0] = 1;
            for(int i = 1; i < nums.length; i++) {
                answer[i] = 0;
            }
            return answer;
        }

        for (int i=0; i< answer.length; i++) {
            System.out.println(answer[i]);
        }

        return nums;

    }

}
