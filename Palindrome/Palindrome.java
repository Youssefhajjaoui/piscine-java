public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        StringBuilder name = new StringBuilder(s);
        return s.toLowerCase() == name.reverse().toString().toLowerCase();
    }
}
