package com.searchAlgos;

public class LinearSearch {

	public static int find(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}

		return -1;

	}

	public static boolean has(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return true;
			}
		}

		return false;

	}

	public static int find(String word, char f) {

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == f)
				return i;

		}

		return -1;
	}

	public static boolean has(String word, char f) {

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == f)
				return true;

		}

		return false;
	}

	public static int[] find(int[][] twoDArr, int target) {

		for (int row = 0; row < twoDArr.length; row++) {
			for (int col = 0; col < twoDArr[row].length; col++) {

				if (twoDArr[row][col] == target) {
					return new int[] { row, col };
				}

			}

		}

		return new int[] { -1, -1 };
	}
	
	public static boolean has(int[][] twoDArr, int target) {

		for (int row = 0; row < twoDArr.length; row++) {
			for (int col = 0; col < twoDArr[row].length; col++) {

				if (twoDArr[row][col] == target) {
					return true;
				}

			}

		}

		return false;
	}
}
