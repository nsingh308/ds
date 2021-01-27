package org.recursion;

import java.util.Stack;

public class TowerOfHanoiAdvance {
	public static int N;
	public static Stack<Integer>[] tower = new Stack[4];

	public static void main(String args[]) {
		tower[1] = new Stack<Integer>();
		tower[2] = new Stack<Integer>();
		tower[3] = new Stack<Integer>();
		
		
		/* Accepting number of disks */

		N = 10;
		int num = N;
		moveDisksToTowers(num);

		display();
		tohMove(num, 1, 3, 2);
		display();
	}

	public static void tohMove(int n, int src, int dest, int aux) {
		if(n ==1) {
			tower[dest].push(tower[src].pop());
			//display();
			return;
		}
		
		tohMove(n-1, src, aux, dest);
		tower[dest].push(tower[src].pop());
		//display();
		tohMove(n-1, aux, dest, src);
		
	}

	/* Function to push disks into stack */
	public static void moveDisksToTowers(int n) {
		for (int d = n; d > 0; d--)
			tower[1].push(d);
	}

	/* Function to display */
	public static void display() {
		System.out.println("  A  |  B  |  C");
		System.out.println("---------------");
		for (int i = N - 1; i >= 0; i--) {
			String d1 = " ", d2 = " ", d3 = " ";
			try {
				d1 = String.valueOf(tower[1].get(i));
			} catch (Exception e) {
			}
			try {
				d2 = String.valueOf(tower[2].get(i));
			} catch (Exception e) {
			}
			try {
				d3 = String.valueOf(tower[3].get(i));
			} catch (Exception e) {
			}
			System.out.println("  " + d1 + "  |  " + d2 + "  |  " + d3);
		}
		System.out.println("\n");
	}

}
