import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {
	public static void main(String[] args) {
		List<Integer> intsList = new ArrayList<Integer>();
		List<Integer> evenNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			intsList.add(i);
		}

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evenNumbers.add(i);
			}
		}
		System.out.println("Complete List: " + intsList);
		System.out.println("Even List: " + evenNumbers);

		int[] numers = { 1, 1, 2, 2, 1, 2, 2, 3, 4, 5 };
		
//		System.out.println(""+Arrays.sort(numers));
		Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		
		for (int i : numers) {
			int count = 1;
			if (!frequency.containsKey(i)) {
				frequency.put(i, count);
			} else {
				count = frequency.get(i);
				frequency.put(i, ++count);
			}
		}
		System.out.println("Frequency map:" + frequency);
	}

}
