import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        Integer res = inventory.get(productId);
	if (res == null){
		return -1;
	}
	return res;
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> result = new ArrayList<>();
	for( String key : inventory.keySet()){
		if (inventory.get(key).equals(price)){
			result.add(key);
		}
	}
	return result;
    }
}
