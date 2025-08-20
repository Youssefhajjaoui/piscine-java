import java.util.List;
import java.util.ArrayList;

public class SortList{
    public static List<Integer> sort(List<Integer> list) {
	List<Integer> result = new ArrayList<>(list);
	if(list == null){
		return result;
	}
        for(int i =0 ; i<list.size() ; i++){
		for (int j = i+1 ; j < list.size() ; j++){
			if (result.get(i) > result.get(j)){
				Integer tmp = result.set(i , result.get(j));
				result.set(j, tmp);
			}
		}
	}
	return result;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
	   List<Integer> result = new ArrayList<>(list);
           for(int i =0 ; i<list.size() ; i++){
		for (int j = i+1 ; j < list.size() ; j++){
			if ( result.get(i) < result.get(j)){
				Integer tmp = result.set(i , result.get(j));
				result.set(j, tmp);
			}
		}
	}
	return result;
    }
}
