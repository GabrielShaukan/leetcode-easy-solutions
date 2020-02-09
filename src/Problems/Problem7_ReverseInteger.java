package Problems;

public class Problem7_ReverseInteger {
    public int solution(int num) {
        String numS = Integer.toString(num);
        String newS;
        if (numS.startsWith("-") && numS.endsWith("0")) {
            numS = numS.substring(1, numS.length()-1);
        } else if (numS.startsWith("-")) {
            numS = numS.substring(1);
        } else if (numS.endsWith("0")) {
            numS = numS.substring(0, numS.length()-1);
        }

        StringBuilder sb = new StringBuilder(numS);
        newS = sb.reverse().toString();

        if (num == 0 || Long.parseLong(newS) > 2147483647 || Long.parseLong(newS) < -2147483648)  {
            return 0;
        } else if (Integer.toString(num).startsWith("-")) {
            newS = "-" + newS;
        }

        return Integer.parseInt(newS);
    }
}
