package Problems;

public class Problem125_ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        String newWord = new StringBuilder(s).reverse().toString();
        return (s.equals(newWord));
    }

}
