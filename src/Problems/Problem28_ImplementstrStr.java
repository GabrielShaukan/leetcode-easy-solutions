package Problems;

public class Problem28_ImplementstrStr {

    public static int solution(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        } else if (needle.isEmpty()) {
            return 0;
        } else {
            return haystack.indexOf(needle);
        }
    }
}
