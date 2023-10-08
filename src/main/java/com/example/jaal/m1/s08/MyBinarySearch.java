package com.example.jaal.m1.s08;

public class MyBinarySearch {

	public static void iterative(int[] a, int number) {
		int end = a.length - 1;
		int start = 0;
		int index;
		while (start < end) {
			// index = end - (end-start)/2;
			index = start + (end - start) / 2;
			if (a[index] == number) {
				System.out.printf("TRUE");
				return;
			} else if (a[index] > number) {

				end = index - 1;

			} else {
				start = index + 1;

			}

		}

		System.out.printf("false");
		return;

	}

	public static void main(String[] args) {
		int[] trialFirst = { -24, -23, -21, -8, 0, 12, 27, 51, 93, 115, 220 };
		int[] trial = { 20, -44 };
		iterative(trialFirst, -24);

	}

}