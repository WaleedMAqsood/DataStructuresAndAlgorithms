/*
 * Binary Search Algorithm
 */
package binarySearchAlgorithm;

public class BinarySearch {

	public static int binarysearch(int[] array, int key, int first, int last) {

		while (first <= last) {
			int mid = first + (last - first) / 2;

			if (array[mid] == key) {
				return mid;

			}

			else if (array[mid] < key) {
				first = mid + 1;
			}

			else if (array[mid] > key) {

				last = mid - 1;

			}

		}
		return -1;

	}

	public static void main(String[] args) {

		int[] myArray = { 4, 5, 6, 7, 16, 22, 33, 66, 88, 100 };
		int key = 33;
		int first = 0;
		int last = myArray.length - 1;

		int result = binarysearch(myArray, key, first, last);

		if (result == -1) {

			System.out.print("The Key was not found");

		} else {
			System.out.print("The Key was found at " + result);
		}

	}

}
