public class BubbleSort {
	public static void sortAscending(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			boolean isSorted = false;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorted = true;

				}
			}
			if (!isSorted) {
				break;
			}

		}
	}

	public static void sortDecending(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			boolean isSorted = false;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorted = true;

				}
			}
			if (!isSorted) {
				break;
			}
		}
	}

}
