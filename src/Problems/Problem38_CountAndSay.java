package Problems;

public class Problem38_CountAndSay {

    public static String solution(int n) {
        int j = 1;
        String start = "11";
        String answer = "";
        if (n == 1) {
            return "1";
        } if (n == 2) {
            return start;
        }

        for (int x = 1; x < n -1; x++) {
            for (int i = 0; i < start.length(); i++) {
                if (i < start.length()-1) {
                    if (start.charAt(i) == start.charAt(i+1))  {
                        j++;
                    } else {
                        answer = answer  + j + start.charAt(i);
                        j = 1;
                    }
                } else{
                    answer = answer  + j + start.charAt(i);
                    break;
                }
            }
            System.out.println(answer);
            start = answer;
            answer = "";
            j = 1;
        }
        System.out.println(answer);
        return start;
    }
}
