package Problems;
import java.io.*;
import java.util.*;

public class Problem20_ValidParentheses {

    public boolean solution(String s) {


        Stack<Character> stack = new Stack<>() {};

        for (int i = 0; i < s.length(); i++) {

            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                System.out.println(stack);
            } else if (stack.lastElement() == '(' && s.charAt(i) == ')') {
                stack.pop();
                System.out.println(stack);
            } else if (stack.lastElement() == '[' && s.charAt(i) == ']') {
                stack.pop();
                System.out.println(stack);
            } else if (stack.lastElement() == '{' && s.charAt(i) == '}') {
                stack.pop();
                System.out.println(stack);
            } else {
                stack.push(s.charAt(i));
            }
        }
        System.out.println(stack);
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

}
