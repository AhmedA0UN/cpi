import java.util.*;

public class TestSubList {
    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(3);
        originalList.add(7);
        originalList.add(5);
        originalList.remove(1);
        originalList.sort(Comparator.naturalOrder());
  	originalList.forEach(System.out::println);

  	System.out.println("*******");

        List<Integer> subList = originalList.subList(1, 3);        
        subList.remove(0);
        subList.add(100); 
        originalList.forEach(System.out::println);
        System.out.println("********");
        subList.forEach(System.out::println);
        System.out.println("********"); 
        originalList.add(6); 
        originalList.forEach(System.out::println);
        System.out.println("********");
//      subList.forEach(System.out::println);
        
    }
}
