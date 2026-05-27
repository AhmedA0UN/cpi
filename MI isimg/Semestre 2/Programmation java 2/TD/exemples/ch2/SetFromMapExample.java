import java.util.*;
public class SetFromMapExample {
	public static void main(String[] args) {
		Map<String, Boolean> map = new TreeMap<>();
		Set<String> set = Collections.newSetFromMap(map);		
		set.add("2");
		set.add("1");
		set.add("3");
		map.put("15",false);		
		System.out.println(set); 
		System.out.println(map); 
	}

}
