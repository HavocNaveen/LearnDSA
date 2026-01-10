package com.searchAlgos;

public class BinarySearch {

	public static int find(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		int searchCount = 1;
		boolean isArrAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = (start + end) / 2;
			if (isArrAsc) {

				if (target > arr[mid]) {
					start = mid + 1;
				} else if (target < arr[mid]) {
					end = mid - 1;
				} else {
					return mid;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;

				} else if (target < arr[mid]) {
					start = mid + 1;
				} else {
					return mid;
				}
			} 

		}

		return -1;
	}

}
