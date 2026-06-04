import java.util.*;
public class SequencedSetExample {
    public static void main (String[] args) {    	
        List<Integer> l = List.of(7, 9, 8);        
        List<Integer> sortedList = new ArrayList<>(l);        
        Collections.sort(sortedList);
        System.out.println("Ordre : " +sortedList);    	
    	SequencedSet<Integer> set = new LinkedHashSet<>(sortedList);
    	set.add(2);
    	set.add(6);
    	set.add(9);
    	System.out.println("Set Original : "+set);
    	set.addFirst(6);
    	System.out.println("Set après ajout : "+set);    	
    	SequencedSet<Integer> set1 = set.reversed(); 
    	set1.addLast(15);
    	System.out.println("Set Original : "+set);
    	System.out.println("Vue Inversée : "+set1);	
    }
}
