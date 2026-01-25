public class MergeSort {
	public static void sortAscending(int arr[]) {
		sortAscendingInPlace(arr, 0, arr.length);
	}
	public static void sortDecending(int arr[]) {
		sortDecendingInPlace(arr, 0, arr.length);
	}
	public static int[] sortAscendingArr(int arr[]) {

		if (arr.length == 1) {
			return arr;
		}

		int left[] = sortAscendingArr(Arrays.copyOfRange(arr, 0, arr.length / 2));
		int right[] = sortAscendingArr(Arrays.copyOfRange(arr, arr.length / 2, arr.length));

		return mergeAscendingArr(left, right);
	}

	private static int[] mergeAscendingArr(int left[], int right[]) {
		int arr[] = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}

		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}

		return arr;
	}

	public static void sortAscendingInPlace(int arr[], int start, int end) {

		if (end - start == 1) {
			return;
		}
		int mid = (start + end) / 2;

		sortAscendingInPlace(arr, start, mid);
		sortAscendingInPlace(arr, mid, end);

		mergeAscendingInPlace(arr, start, mid, end);
	}

	private static void mergeAscendingInPlace(int[] arr, int start, int mid, int end) {
		int joined[] = new int[end - start];
		int i = start, j = mid, k = 0;

		while (i < mid && j < end) {
			if (arr[i] < arr[j]) {
				joined[k++] = arr[i++];
			} else {
				joined[k++] = arr[j++];
			}
		}

		while (i < mid) {
			joined[k++] = arr[i++];
		}
		while (j < end) {
			joined[k++] = arr[j++];
		}
		for (k = 0; k < joined.length; k++) {
			arr[start+k]=joined[k];
			
		}
	}

	public static int[] sortDecendingArr(int[] arr) {
		if (arr.length == 1) {
			return arr;
		}

		int left[] = sortDecendingArr(Arrays.copyOfRange(arr, 0, arr.length / 2));
		int right[] = sortDecendingArr(Arrays.copyOfRange(arr, arr.length / 2, arr.length));

		return mergeDecendingArr(left, right);

	}

	private static int[] mergeDecendingArr(int[] left, int[] right) {
		int joined[] = new int[left.length + right.length];

		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] > right[j]) {
				joined[k++] = left[i++];
			} else {
				joined[k++] = right[j++];
			}
		}
		while (i < left.length) {
			joined[k++] = left[i++];
		}

		while (j < right.length) {
			joined[k++] = right[j++];
		}
		return joined;

	}
	public static void sortDecendingInPlace(int arr[], int start, int end) {

		if (end - start == 1) {
			return;
		}
		int mid = (start + end) / 2;

		sortDecendingInPlace(arr, start, mid);
		sortDecendingInPlace(arr, mid, end);

		mergeDecendingInPlace(arr, start, mid, end);
	}

	private static void mergeDecendingInPlace(int[] arr, int start, int mid, int end) {
		int joined[] = new int[end - start];
		int i = start, j = mid, k = 0;

		while (i < mid && j < end) {
			if (arr[i] > arr[j]) {
				joined[k++] = arr[i++];
			} else {
				joined[k++] = arr[j++];
			}
		}

		while (i < mid) {
			joined[k++] = arr[i++];
		}
		while (j < end) {
			joined[k++] = arr[j++];
		}
		for (k = 0; k < joined.length; k++) {
			arr[start+k]=joined[k];
			
		}
	}

}