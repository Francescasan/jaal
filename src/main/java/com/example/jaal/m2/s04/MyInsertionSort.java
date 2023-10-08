package com.example.jaal.m2.s04;

public class MyInsertionSort {
	public static int[] iterative(int[] array) {

		int j, temp, i;
		for (i = 0; i < array.length; i++) {
			temp = array[i];
			j = i - 1;
			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;

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