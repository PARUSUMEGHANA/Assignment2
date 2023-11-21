package overidepract;

import java.util.Date;

class Pair<K, V> {
	private K key;
	private V value;

	public void setKey(K key) {
		if (!(key instanceof String)) {
			throw new IllegalArgumentException("Key must be of type String");
		}
		this.key = key;
	}

	public void setValue(V value) {
		if (!(value instanceof String) && !(value instanceof Date)) {
			throw new IllegalArgumentException("Value must be of type String or Date");
		}
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}

public class Pairset {
	public static void main(String[] args) {
		Pair<String, String> stringPair = new Pair<>();
		stringPair.setKey("1");
		stringPair.setValue("Hello");

		System.out.println("Key: " + stringPair.getKey() + ", Value: " + stringPair.getValue());

		Pair<String, Date> datePair = new Pair<>();
		datePair.setKey("Today is");
		datePair.setValue(new Date());

		System.out.println("Key: " + datePair.getKey() + ", Value: " + datePair.getValue());
	}
}
