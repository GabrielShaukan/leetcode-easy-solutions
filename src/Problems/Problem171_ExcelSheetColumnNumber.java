package Problems;

public class Problem171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int answer = 0;
        for (int i=0; i < s.length(); i++){
            char c = s.charAt(s.length()-i-1);
            int num = (int) c;
            answer += (num - 64)  * Math.pow(26,i);
        }
        return answer;
    }
}
