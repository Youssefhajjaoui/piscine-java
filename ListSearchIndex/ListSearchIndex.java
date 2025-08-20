import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex{
    public static Integer findLastIndex(List<Integer> list, Integer value) {
	if (list == null){
		return null;
	}
	Integer num = null;
	for (int i = 0 ; i < list.size() ; i++){
		if (list.get(i).equals(value)){
			num = i ; 
		}
	}
	return num;
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
	if(list == null){
		return null
	}
	for(int i = 0; i<list.size() ; i++){
		if( list.get(i).equals(value)){
			return i;
		}
	}
	return null;
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> list1 = new ArrayList<Integer>();
	for(int i=0 ; i < list.size() ; i++){
		if (list.get(i).equals(value)){
			list1.add(i);
		}
	}
	return list1;
    }

}
