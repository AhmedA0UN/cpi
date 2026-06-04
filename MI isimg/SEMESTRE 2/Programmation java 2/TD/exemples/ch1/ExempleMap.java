import java.util.*;

public class ExempleMap {
	
	public static void main(String[] args) {

		Map<String,String> map = new LinkedHashMap<>();
		  map.put("map", "HashMap");
		  System.out.println(map.put("cours", "java2"));
		  System.out.println(map.put("map", "LinkedHashMap"));
		  System.out.println(map.get("abc"));
		  map.put("test", "testtest");	 		  
		  map.forEach( (k ,v) -> System.out.println(k+":"+v));
		  
	}
}