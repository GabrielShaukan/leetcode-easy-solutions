package Problems;

public class Problem14_LongestCommonPrefix {
    public static String solution(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        String str = strs[0];
        String answer = "";

        for (int i = 0; i < strs.length; i++) {
            if (str.length() > strs[i].length()) {
                str = strs[i];
            }
        }

        int j = 0;
        int length = str.length();
        String pureStr = str;

        for(int a = 0; a < length; a++) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].startsWith(str)) {
                    j++;
                }
            }
            if (j == strs.length) {
                answer = str;
                break;
            } else {
                str = pureStr.substring(0,pureStr.length() - a -1);
                j = 0;
            }
        }
        System.out.println(answer);
        return answer;
    }
}
