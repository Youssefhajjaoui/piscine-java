import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern(
                "'Le' d MMMM 'de l''an' u 'à' HH'h'mm'm' 'et' ss's'",
                Locale.FRENCH);
        return dateTime.format(format);
    }

    public static String formatSimple(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yy", Locale.ITALIAN);
        return date.format(formatter);
    }

    public static String formatIso(LocalTime time) {
        return time.format(DateTimeFormatter.ISO_LOCAL_TIME);
    }
}
