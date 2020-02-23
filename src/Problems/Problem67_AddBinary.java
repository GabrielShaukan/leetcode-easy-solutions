package Problems;

public class Problem67_AddBinary {

    public String solution(String a, String b) {
        int shortLength;
        int longLength;
        int sum;
        int carry = 0;
        String answer = "";

        if (a.length() > b.length()) {
            shortLength = b.length();
            longLength = a.length();
            for (int i =0; i< longLength ; i++) {
                b = 0 + b;
            }
        } else {
            shortLength = a.length();
            longLength = b.length();
            for (int i =0; i< longLength ; i++) {
                a = 0 + a;
            }
        }

        for(int i = 1; i < longLength + 1 ; i++) {
            sum = Integer.parseInt(String.valueOf(a.charAt(a.length() - i)))  + Integer.parseInt(String.valueOf(b.charAt(b.length() - i))) + carry;
            System.out.println(sum);
            if (sum == 2 && i == longLength ) {
                answer = 10 + answer;
            } else if (sum == 2) {
                answer = 0 + answer;
                carry = 1;
            } else if (sum == 3 && i == longLength) {
                answer = 11 + answer;
            } else if (sum == 3 ) {
                answer = 1 + answer;
                carry = 1;
            } else {
                answer =  sum + answer;
                carry = 0;
            }
        }

        return answer;
    }
}
