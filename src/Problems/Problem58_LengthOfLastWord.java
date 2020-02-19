package Problems;

public class Problem58_LengthOfLastWord {
    public static int solution(String s) {
        if (s.length() == 0) {
            return 0;
        }
        String[] answer = s.split(" ");
        if (answer.length == 0) {
            return 0;
        }
        return answer[answer.length -1].length();
    }
}
