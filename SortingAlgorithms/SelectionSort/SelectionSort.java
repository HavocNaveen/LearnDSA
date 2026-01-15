public class SelectionSort {
	public static void sortAscending(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;

			for (int j = i; j < arr.length; j++) {

				if (arr[j] < arr[minIndex])
					minIndex = j;
			}

			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

	}
	public static void sortDecending(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			int maxIndex = i;

			for (int j = i; j < arr.length; j++) {

				if (arr[j] > arr[maxIndex])
					maxIndex = j;
			}

			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
		}

	}

}
