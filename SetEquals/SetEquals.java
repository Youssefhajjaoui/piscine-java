public class SetEquals{
   public static boolean areSetsEqual(Set<String> set1, Set<String> set2) {
        if (set1 == null && set2 != null || set1 != null && set2 == null){
	return false;
	}else if (set1 == null && set2 == null){
	return true;
	}
	return set1.equals(set2);
    }
}
