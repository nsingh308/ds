package org.recursion;

public class NightTourProblem {

	static final int MAX_ROWS = 3;
	static final int MAX_COLS = 3;
	static String table[][] = new String[MAX_ROWS][MAX_COLS];
	static final int[][] VALID_MOVES = { { -2, 1 }, { -2, -1 }, { -1, 2 }, { 1, 2 }, { -1, -2 }, { 1, -2 }, { 2, 1 },
			{ 2, -1 } };

	private static boolean isMoveInBoundaries(int row, int col) {

		// check beyond postive boundaries
		// check beyond negative boundaries
		if (row >= MAX_ROWS || col >= MAX_COLS || row < 0 || col < 0) {
			return false;
		}
		// check if it is Night Move
		return true;
	}

	public static void main(String arg[]) {
		int initialRow = 0;
		int initialCol = 0;
		int targetRow = 0;
		int targetCol = 0;
		display(table);
		moveKnight(initialRow, initialCol, targetRow, targetCol);
		display(table);
	}

	// rows can go +2,
	private static void moveKnight(int basePosRow, int basePosCol, int targetRow, int targetCol) {

		if (!isMoveInBoundaries(targetRow, targetCol))
			return;

		// update base position of night by updating basePosRow & basePosCol
		basePosRow = targetRow;
		basePosCol = targetCol;

		if (table[targetRow][targetCol] == "KN") {
			return;
		}
		table[targetRow][targetCol] = "KN";
		for (int[] nextMove : VALID_MOVES) {
			int newTargetRow = basePosRow + nextMove[0];
			int newTargetCol = basePosCol + nextMove[1];
			moveKnight(basePosRow, basePosCol, newTargetRow, newTargetCol);
		}
	}

	private static void display(String table[][]) {
		System.out.println("======================Before Printing======================");
		for (int row = 0; row < table.length; row++) {
			for (int col = 0; col < table[row].length; col++) {
				System.out.print("(" + row + "," + col + ")=" + table[row][col] + ", ");
			}
			System.out.println();
		}
		System.out.println("======================Printing Finished======================");
	}
}
