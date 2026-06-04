
import java.util.*;

public class TestJoker{
	
	public static void main(String[] args) {	
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(100);
		
		ArrayList<?> l1 = l;
		
//      l1.add(300);
//      Integer k =   l1.get(0);
//		System.out.println(k);
		
		
		ArrayList<? extends Integer> l2 = l;
		
//	    l2.add(2);
        Integer i = l2.get(0);
		System.out.println(i);

		ArrayList<? super Integer> l3 = l;
		l3.add(200);
//		Integer  j =  l3.get(1);
//		System.out.println(j);

	}
}
