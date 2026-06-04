import java.util.*;
public class MapExample {
	public static void main(String[] args) {		
	Map<String, Set<String>> m0 = Map.of("e01", 
			                              Set.of("f","e"),
			                             "e02", 
			                             new LinkedHashSet<>(Arrays.asList("c","d","c","e"))
			                             );
	m0.forEach((k,v)-> System.out.println((k+":"+v)));
	System.out.println("******");		
	Map<String, Integer> villes = new LinkedHashMap<>();
		villes.put("Monastir", 73);
		villes.put("Sfax", 74);
		villes.put("Sousse", 73);
		villes.put("Ariana", 71);
		villes.put("Tunis", 71);
		villes.put("Gabes", 75);
		var o1 =villes.keySet();
		o1.remove("Monastir");
     //  	o1.add("Medenine");
		o1.forEach(System.out::println);
	        System.out.println("******");
	        villes.forEach((k,v)-> System.out.println((k+":"+v)));
	        System.out.println("*****");	
                Collection<Integer> o2 = villes.values();
		villes.put("Mahdia", 73);
		o2.remove(71);
		villes.remove("Gabes");
		villes.forEach((k,v)-> System.out.println((k+":"+v)));
		System.out.println("*****");
		o2.forEach(System.out::println);
		System.out.println("******");		
		String clef = "Sousse";
		System.out.println("Code : " + villes.get(clef)); 
		villes.remove(clef);
		System.out.println("Code par défaut : " + villes.getOrDefault(clef, 70)); 
		System.out.println(villes.containsKey("Nabeul")); 
		System.out.println(villes.containsValue(73)); 
	}
}
