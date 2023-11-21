package overidepract;

public class ArrayUtil12 {
	public static <T> void exchangeElements(T[] array, int index1, int index2) {
		if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
			throw new IllegalArgumentException("Invalid indices");
		}

		T temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		exchangeElements(intArray, 1, 3);

		for (Integer num : intArray) {
			System.out.print(num + " ");
		}
	}

}
