package Problems;

public class Problem13_RomanToInteger {
    public static int solution(String s) {
        int sum = 0;
        char next = 'a';

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (i < s.length()-1) {
                next = s.charAt(i+1);
            }

            if (temp == 'I') {
                if (next == 'V') {
                    sum += 4;
                    i++;
                } else if (next == 'X') {
                    sum += 9;
                    i++;
                } else {
                    sum += 1;
                }

            } else if (temp == 'V') {
                sum += 5;
            } else if (temp == 'X') {
                if (next == 'L') {
                    sum += 40;
                    i++;
                } else if (next == 'C') {
                    sum += 90;
                    i++;
                } else {
                    sum += 10;
                }
            } else if (temp == 'L') {
                sum += 50;
            } else if (temp == 'C') {
                if (next == 'D') {
                    sum += 400;
                    i++;
                } else if (next == 'M') {
                    sum += 900;
                    i++;
                } else {
                    sum += 100;
                }
            } else if (temp == 'D') {
                sum += 500;
            } else if (temp == 'M') {
                sum += 1000;
            }
        }
        return sum;
    }
}
