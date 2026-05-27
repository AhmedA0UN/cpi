import java.util.*;

public class CollectiontoArray {
  public static void main(String[] args) {
	
	  Collection<Integer> s = new LinkedHashSet<>();	  
	  s.add(5);
	  s.add(1);
	  s.add(4);
	  System.out.println(s.add(1));
	  s.forEach(elt -> System.out.println(elt));
	  System.out.println("*******");
	  
	  List<Integer> c = new ArrayList<>();
	  c.add(8);
	  c.add(9);
	  c.add(1);
	  c.add(3);
	  c.add(1);
	  System.out.println(c);
	  System.out.println("*******");
	  c.forEach(System.out::println);
	  System.out.println("*******");
	  System.out.println(Arrays.toString(c.toArray()));
	  System.out.println("*******");
	  System.out.println(Arrays.toString(c.toArray(new Integer[] {2, 3})));
	  System.out.println("*******");
	  System.out.println(Arrays.toString(c.toArray(new Integer[] {7, 6, 4, 1, 6, 5, 4})));
	    
  }
}
