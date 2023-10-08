package com.example.jaal.m1.s09;

public class MyMerge {

	public static void main(String[] args) {
		int[] trialFirst = { -24, -23, -21, -8, 0, 12, 27, 51, 93, 115, 220 };

		int[] trialFirst1 = { -24, -23, -21, -8, 0, 12, 27, 51, 93, 115, 220 };
		int[] trial = { -44, -40 };
		int[] array = new int[trial.length + trialFirst.length];
		array = marge(trialFirst, trial);
		for (int i = 0; i < array.length; i++) {
			System.out.println("il numero è" + array[i]);
		}

	}

	private static int[] marge(int[] trialFirst, int[] trial) {

		int length = trialFirst.length + trial.length;
		int[] array = new int[length];
		int z = 0;
		int j = 0;

		for (int i = 0; i < length; i++) {

			if (z < trialFirst.length) {
				if (j < trial.length) {
					if (trialFirst[z] <= trial[j]) {
						array[i] = trialFirst[z];
						z++;
					} else if (trial[j] < trialFirst[z]) {
						array[i] = trial[j];
						j++;
					}
				} else {
					array[i] = trialFirst[z];
					z++;
				}
			} else {
				if (j < trial.length) {

					array[i] = trial[j];
					j++;

				}
			}
		}

		return array;
	}

}