package overidepract;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Random1HashMap {
	public static void main(String[] args) {
		Map<Integer, Double> randomMap = new HashMap<>();
		Random random = new Random();

		// Adding 10 random int keys and corresponding random double values
		for (int i = 0; i < 10; i++) {
			randomMap.put(random.nextInt(), random.nextDouble());
		}

		// Printing the HashMap
		for (Map.Entry<Integer, Double> entry : randomMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
