import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        List<String> arr1 = new ArrayList<>(first), arr2 = new ArrayList<>(second);
        int len = 0;
        if (arr1.size() < arr2.size()) {
            len = arr1.size();
        } else {
            len = arr2.size();
        }
        Map<String, String> res = new HashMap<>();
        for (int i = 0; i < len; i++) {
            res.put(arr1.get(i), arr2.get(i));
        }
        return res;
    }
}