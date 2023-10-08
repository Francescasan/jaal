/**
 * Write a program that, given a certain time in days, hours, minutes and seconds,
return the total number of seconds.
 */
package com.example.jaal.myExercises;

import java.util.Scanner;

public class TimeConverter {
	private int s, m, h, d;

	public TimeConverter(int day, int hours, int minutes, int seconds) {
		d = day;
		h = hours;
		m = minutes;
		s = seconds;
	}

	public int getSeconds() {
		int sTot = d * 86400 + h * 3600 + m * 60 + s;
		return sTot;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il numero dei giorni ");
		int day = in.nextInt();
		System.out.print("\nInserisci il numero delle ore ");
		int hours = in.nextInt();
		System.out.print("\nInserisci il numero dei minuti ");
		int minutes = in.nextInt();
		System.out.print("\nInserisci il numero dei secondi ");
		int seconds = in.nextInt();
		TimeConverter convert = new TimeConverter(day, hours, minutes, seconds);
		System.out.println("\nSecondi totali : " + convert.getSeconds());
	}
}