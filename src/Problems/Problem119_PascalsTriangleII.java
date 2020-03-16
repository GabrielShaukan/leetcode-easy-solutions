package Problems;

import java.util.ArrayList;
import java.util.List;

public class Problem119_PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> pascal = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();

        pascal.add(1);

        for (int j = 0; j < rowIndex ; j++) {
            temp.add(1);
            for (int i = 0; i < pascal.size() -1 ; i++) {
                temp.add(pascal.get(i) + pascal.get(i+1));
            }
            temp.add(1);
            pascal = new ArrayList<Integer>();
            for (int i = 0; i < temp.size(); i++) {
                pascal.add(temp.get(i));
            }
            temp.clear();
        }

        return pascal;


    }

}
