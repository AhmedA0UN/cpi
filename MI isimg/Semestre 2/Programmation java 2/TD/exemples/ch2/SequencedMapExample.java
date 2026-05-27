import java.util.*;
public class SequencedMapExample {
	public static void main(String[] args) {	    	
    	SequencedMap<Integer, String> map = new LinkedHashMap<>();        
        map.put(3, "Trois");
        map.put(1, "Un");
        map.put(2, "Deux");	
        map.put(4, "Quatre"); 
        map.forEach((k,v)-> System.out.println((k+":"+v)));
        System.out.println("********");
        SequencedMap<Integer, String> m= Collections.unmodifiableSequencedMap(map);
        map.put(5, "Cinq");
        m.forEach((k,v)-> System.out.println((k+":"+v)));       
        System.out.println("********");
//        m.put(6, "Six");
//        m.forEach((k,v)-> System.out.println((k+":"+v)));

		     

	}

}
