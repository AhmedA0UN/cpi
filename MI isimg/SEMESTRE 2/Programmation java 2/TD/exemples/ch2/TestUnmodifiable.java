import java.util.*;

public class TestUnmodifiable{
	public static void main(String args[]) {
    	
        List<String> l1 = new ArrayList<>();
        l1.add("1");
        l1.add("2");
        List<String> l2 = Collections.unmodifiableList(l1);
        l1.add("3");
        
      System.out.println("Liste initiale :"+l1);
      System.out.println("Vue non modifiable :"+l2);
      
        try {
    	  l2.set(1,"10");
          System.out.println("Vue non modifiable :"+l2); 
          
	      }catch (Exception e){
		   e.printStackTrace();
       }
      l1.add("4");
      System.out.println("Liste initiale après ajout :"+l1);

      List<String> l3 = List.copyOf(l1);
      System.out.println("Liste non modifiable par copyOf :"+l3);

      l1.add("5");
      System.out.println("Liste initiale après un autre ajout :"+l1);
      System.out.println("Liste non modifiable par copyOf après cet ajout :"+l3);
     
      List<String> l0 = Arrays.asList(l1.toArray(new String[]{}));
      l0.set(0,"xyz");
      System.out.println(l0);      
    }
}