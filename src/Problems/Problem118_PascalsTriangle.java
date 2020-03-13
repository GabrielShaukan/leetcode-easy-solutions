package Problems;

import java.util.ArrayList;
import java.util.List;

public class Problem118_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> pascal = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        if (numRows == 0) {
            return answer;
        }
        pascal.add(1);
        answer.add(pascal);

        for (int j = 0; j < numRows -1; j++) {
            temp.add(1);
            for (int i = 0; i < pascal.size() -1 ; i++) {
                temp.add(pascal.get(i) + pascal.get(i+1));
            }
            temp.add(1);
            pascal = new ArrayList<Integer>();
            for (int i = 0; i < temp.size(); i++) {
                pascal.add(temp.get(i));
            }
            answer.add(pascal);
            temp.clear();
        }
        return answer;
    }
}
