package BubbleSort;

public class BubbleSort {

	public static void main(String args[]) {

		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		System.out.println("Printing Before Sorting");
		print(arr);
		// Sorting method
		sortArray(arr);
		// Calling print method
		System.out.println("Printing after Sorting");
		print(arr);

	}

	public static void sortArray(int array[]) {

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}

			}
		}
	}

	// Method to Print elements
	public static void print(int array[]) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();

	}
}
