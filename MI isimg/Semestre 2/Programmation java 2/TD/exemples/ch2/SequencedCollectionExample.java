import java.util.*;
public class SequencedCollectionExample {
    public static void main(String[] args) {
    	SequencedCollection<Integer> sequencedList = new ArrayList<>();
        sequencedList.add(4);
        sequencedList.add(2);
        sequencedList.add(1);
        sequencedList.add(3);
        sequencedList.addFirst(5);
        sequencedList.remove(1);        
        System.out.println("Ordre de rencontre : " + sequencedList);
        sequencedList.addFirst(0);
        System.out.println("Nouvel ordre de rencontre : " + sequencedList);
    }
}