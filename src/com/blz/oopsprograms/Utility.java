package com.blz.oopsprograms;

import java.util.Scanner;

public class Utility {

	private static final Scanner sc = new Scanner(System.in);

	public static int readInteger() {
		return sc.nextInt();
	}

	public static float readFloat() {
		return sc.nextFloat();
	}

	public static double readDouble() {
		return sc.nextDouble();
	}

	public static boolean readBoolean() {
		return sc.hasNextBoolean();
	}

	public static String readString() {
		return sc.nextLine();
	}

	public static byte readByte() {
		return sc.nextByte();
	}

	public static long readLong() {
		return sc.nextLong();
	}

	public static String[][] deckOfCard2DArray(String[] suits, String[] Ranks, String[][] player) {
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 13; j++) {

				player[i][j] = (suits[i] + "-" + Ranks[j]);
			}
		}
		return player;
	}

	public static int shuffletheCardsrow() {
		int row = (int) (Math.random() * ((3 - 0) + 1)) + 0;

		return row;

	}

	public static int shuffletheCardscolumn() {
		int col = (int) (Math.random() * ((12 - 0) + 1)) + 0;

		return col;

	}

	public static void ShuffletheCards(int numberoftimes, String[][] Cards) {
		int rowforfirstcard = 0;
		int columnforfirstcard = 0;
		int rowforsecondcard = 0;
		int columnforsecondcard = 0;
		String[][] newcards = new String[4][13];

		for (int i = 0; i < numberoftimes; i++) {

			rowforfirstcard = shuffletheCardsrow();
			columnforfirstcard = shuffletheCardscolumn();
			rowforsecondcard = shuffletheCardsrow();
			columnforsecondcard = shuffletheCardscolumn();
			newcards = shuffleTwoCards(rowforfirstcard, columnforfirstcard, rowforsecondcard, columnforsecondcard,
					Cards);

		}
		DeckOfCard.displayCards2DArray(newcards);
	}

	private static String[][] shuffleTwoCards(int rowforfirstcard, int columnforfirstcard, int rowforsecondcard,
			int columnforsecondcard, String[][] Cards) {

		String temp = Cards[rowforfirstcard][columnforfirstcard].toString();
		Cards[rowforfirstcard][columnforfirstcard] = Cards[rowforsecondcard][columnforsecondcard];
		Cards[rowforsecondcard][columnforsecondcard] = temp;

		return Cards;

	}

}
