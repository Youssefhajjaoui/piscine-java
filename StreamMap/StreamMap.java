import java.util.*;
import java.util.stream.*;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        return s.map(v -> v.length()).count().toInteger();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        // your code here
    }
    
    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        // your code here
    }
}
