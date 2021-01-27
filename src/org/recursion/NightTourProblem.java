package org.recursion;

public class NightTourProblem {
	
	static final int rows = 8;
	static final int cols = 8;
	
	
	public static void main(String arg []) {
		int table[][]=new int[rows][cols];
		
		table= new int[][]{ {0,1},{1,1}};
		moveKnight(table);
		display(table);
	}
	//rows can go +2, 
	private static void moveKnight(int[][] table) {
		// TODO Auto-generated method stub
		
	}

	private static void display(int table[][]) {
		for(int row = 0 ; row < table.length ; row++) {
			for(int col = 0; col < table[row].length; col++) {
				System.out.print("("+row+","+col+")="+table[row][col]+", ");
			}
			System.out.println();
		}
	}
}
