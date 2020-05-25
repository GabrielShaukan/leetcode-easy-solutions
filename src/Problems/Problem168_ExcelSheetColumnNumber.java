package Problems;

public class Problem168_ExcelSheetColumnNumber {

    public String convertToTitle(int n) {
        String answer = "";
        if (n == 0) {return answer;}
        if (n % 26 == 0) {answer += (char) (64 + 26);} else {answer += (char) (64 + n % 26);}
        //Counter for incrementation
        int x = 27;
        while (n >= x) {
            if (n % 26 == 0) {
                n = n / 26;
                if (n <= x) {
                    answer = (char) (63 + n ) + answer;
                    //Increment Counter
                    x++;
                } else {
                    answer = (char) (63 + n % 26 ) + answer;
                }
            } else {
                n = n / 26;
                if (n <= 26) {
                    answer = (char) (64 + n ) + answer;
                } else {
                    answer = (char) (64 + n % 26 ) + answer;
                }
            }
        }
        return answer;
    }

}
