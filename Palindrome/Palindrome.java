public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        StringBuilder name = new StringBuilder(s);
        return name.reverse().toString().toLowerCase().compareTo(s.toLowerCase()) == 0;
    }
}
