import java.util.*;

public class TestMap {
	
	public static void main(String[] args) {

		Map<String,String> map = new LinkedHashMap<>();
		  map.put("map", "HashMap");
		  System.out.println(map.put("cours", "java2"));
		  System.out.println(map.put("map", "LinkedHashMap"));
		  System.out.println(map.get("abc"));

		  map.put("test", "testtest");	  
		  
		  map.forEach( (k ,v) -> System.out.println(k+":"+v));
		  
		for (var ma : map.entrySet())
		{
			ma.setValue("rr");
			System.out.println(ma.getKey()+":"+ ma.getValue());
		}
		  map.put("exemple", "exemple");	  
	
	          System.out.print("******Valeurs:******** ");
		  System.out.println(map.values()); 
		  map.values().remove("rr"); 
		  System.out.print("******Clés:******** ");
		  System.out.println(map.keySet()); 
	//	  map.values().add("abc");
		  System.out.println(map.values()); 
  
	}

}

