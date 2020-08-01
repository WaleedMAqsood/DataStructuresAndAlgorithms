package linearSearchAlgorithm;

public class Linearsearch {

	public static void main(String[] args) {
		int[] array = { 2, 44, 33, 28, 11, 4, 155, 221, 234 };
		int valueToFind = 28;

		int result = searchValue(array, valueToFind);

		if (result == -1) {
			System.out.println("The value does not exist ");

		} else {

			System.out.println("The value is at index " + result);

		}
	}

	public static int searchValue(int[] array, int value) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				return i;
			}

		}
		return -1;

	}
}
