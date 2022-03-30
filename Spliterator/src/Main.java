import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		//create a list of Integer
		ArrayList<Integer> list = new ArrayList<>();
		list.add(48);
		list.add(25);
		list.add(32);
		list.add(75);
		list.add(37);
		
		//obtain a stream
		Stream<Integer> stream = list.stream();
		
		//obtain a Spliterator
		Spliterator<Integer> spliterator = stream.spliterator();
		
		//iterate the elements of stream
//		System.out.println("output of spliterator before split: ");
//		while(spliterator.tryAdvance(n->System.out.print(n + " ")));
		
		//split the first iterator
		Spliterator<Integer> spliterator2 = spliterator.trySplit();
		
		//if spliterator could be split, use spliterator2 first
		if(spliterator2 != null) {
			System.out.println("\noutput of spliterator2: ");
			spliterator2.forEachRemaining((n)->System.out.print(n + " "));
		}
		
		//now use spliterator
		System.out.println("\noutput of use spliterator after split: ");
		spliterator.forEachRemaining((n)->System.out.print(n + " "));
	}

}
