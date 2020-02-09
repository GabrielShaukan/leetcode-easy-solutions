package Problems;
import java.util.LinkedList;


public class Problem9_PalindromeNumber {
    public boolean solution(int num) {
        int initialNum = num;
        int newNum = 0;
        int i = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (num > 0) {
            System.out.println( num % 10);
            stack.push(num % 10);
            num = num / 10;
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            newNum = (int) (stack.pop() * Math.pow(10, i)) + newNum;
            i++;
            System.out.println(newNum);
        }
        if (initialNum == newNum) {
            return true;
        } else {
            return false;
        }
    }
}
