import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        int val = (int) s.map(V -> V.length()).count();
        return val;
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(v -> v.toUpperCase()).toList();
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(v -> v > 42).map(Double::intValue).collect(Collectors.toSet());
    }
}