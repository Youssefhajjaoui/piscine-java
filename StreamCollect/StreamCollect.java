import java.util.List;
import java.util.Map;
import java.util.stream.*;
import java.util.*;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        return s.collect(Collectors.groupingBy(
            v -> Character.toUpperCase(v.charAt(0))
        ));
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        return s.collect(Collectors.groupingBy(
            v -> v % 4,
            Collectors.maxBy(Integer::compareTo)
        ));
    }


    public static String orderAndConcatWithSharp(Stream<String> s) {
        return s.sorted()                    
                .collect(Collectors.joining(" # " , "{" , "}"));  
    }
}
