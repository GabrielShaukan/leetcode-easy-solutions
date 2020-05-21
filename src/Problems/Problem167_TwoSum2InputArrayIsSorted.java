package Problems;

public class Problem167_TwoSum2InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        int sum = 0;
        int answer[] = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    answer[0] = i+1;
                    answer[1] = j+1;
                    return answer;
                }
            }
        }
        return answer;

    }

}
