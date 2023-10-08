package com.example.jaal.m2.s03;

public class MySelectionSort {
	public static int[] iterative(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {

				if (array[min] > array[j]) {
					min = j;
				}
			}

			if (min != i) {
				int k = array[min];
				array[min] = array[i];
				array[i] = k;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] trialFirst = { -2, -20, -1, -8, 0, 12, 100, 51, 93, 115, 220 };

		int[] trialFirst1 = { -24, -23, -21, -8, 0, 12, 27, 51, 93, 115, 220 };
		int[] trial = { -44, -40 };
		int[] array = new int[trialFirst.length];
		array = iterative(trialFirst);
		for (int i = 0; i < array.length; i++) {
			System.out.println("il numero è" + array[i]);
		}

	}

}