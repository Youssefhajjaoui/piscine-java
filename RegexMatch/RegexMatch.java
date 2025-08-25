
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {
    public static boolean containsOnlyAlpha(String s) {
        return Pattern.matches("[a-zA-Z]+", s);
    }

    public static boolean startWithLetterAndEndWithNumber(String s) {
        // s.matches()
        Pattern alpha = Pattern.compile("^[a-zA-Z].*\\d$");
        Matcher m = alpha.matcher(s);
        return m.matches();

    }

    public static boolean containsAtLeast3SuccessiveA(String s) {
        return s.matches(".*[A]{3,}.*");
    }

}