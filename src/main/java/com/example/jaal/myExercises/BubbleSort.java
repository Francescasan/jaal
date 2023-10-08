package com.example.jaal.myExercises;

public class BubbleSort {
	public static int[] iterative(int[] array) {
		for (int i = 0; i < array.length; i++) {
			boolean costan = false;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int k = array[j];
					array[j] = array[j + 1];
					array[j + 1] = k;
					costan = true;
				}
			}
			if (!costan) {
				break;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] trialFirst = { -24, -20, -1, -8, 0, 12, 100, 51, 93, 115, 220 };

		int[] trialFirst1 = { -24, -23, -21, -8, 0, 12, 27, 51, 93, 115, 220 };
		int[] trial = { -44, -40 };
		int[] array = new int[trialFirst.length];
		array = iterative(trialFirst);
		for (int i = 0; i < array.length; i++) {
			System.out.println("il numero è" + array[i]);
		}

	}
}
