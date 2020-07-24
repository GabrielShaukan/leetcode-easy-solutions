package Problems;

import java.util.HashMap;

public class Problem205_IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> letters = new HashMap<Character,Character> ();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(letters.containsKey(a)) {
                if (letters.get(a) == b) {
                    continue;
                } else return false;
            } if(!letters.containsValue(b)) {
                letters.put(a,b);
            } else return false;
        }
        return true;
    }

}
