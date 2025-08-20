import java.util.Map;

public class MapEquals {
    public static boolean areMapsEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        if (map1 == null && map2 != null || map2==null && map1 != null){
		return false;
	}else if (map1 == null && map1 ==null){
		return true;
	}
	return map1.equals(map2);
    }
}

