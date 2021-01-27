package org.recursion;

public class TowerOfHanoiBasic {

	static void towerOfHanoi(int n, String srcRod, String destRod, String auxRod) {
		
		
		if (n == 1) {
			System.out.println("Move disk 1 from " + srcRod + " to " + destRod);
			return;
		}
		
		
		towerOfHanoi(n - 1, srcRod, auxRod, destRod);
		
		
		System.out.println("Move disk " + n + " from " + srcRod + " to " + destRod);
		
		
		towerOfHanoi(n - 1, auxRod, destRod, srcRod);
	}

//Driver code
	public static void main(String args[]) {
		int n = 2; // Number of disks
		towerOfHanoi(n, "A", "C", "B"); // A, B and C are names of rods
	}

}
