package org.recursion;

public class GenerateNBitsBacktrackingV2 {

	static final int DEPTH_REACHED = 2;

	public static void main(String arg[]) {
		int depth_index = 0;
		int bit = -1;
		generateBits(true, depth_index, bit);
	}

	private static void generateBits(boolean isIntialCall, int depth_index, int bit) {

		if (isIntialCall) {
			generateBits(false, depth_index, 0);
			generateBits(false, depth_index, 1);
			return;
		}

		if (depth_index == DEPTH_REACHED) {
			return;
		}
		
		if(bit == 0) {
			System.out.println("left: Depth:" + depth_index + " Bit: " + bit);	
		}else {
			System.out.println("right: Depth:" + depth_index + " Bit: " + bit);	
		}
		
		generateBits(false, depth_index + 1, 0);
		generateBits(false, depth_index + 1, 1);
		return;

	}
}
