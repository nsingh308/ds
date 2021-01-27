package org.recursion;

public class GenerateNBitsBacktracking {
	
	static final int DEPTH_REACHED = 3;
	
	public static void main(String arg[]) {
		int depth_index = 0;
		boolean left = false;
		boolean right = false;
		generateBits(true, depth_index, left, right);
	}

	private static void generateBits(boolean isIntialCall, int depth_index, boolean left, boolean right ) {
		
		if(isIntialCall) {
			generateBits(false, depth_index, true, false);
			generateBits(false, depth_index, false, true);
		}
		
		if(depth_index == DEPTH_REACHED ) {
			return;
		}
			
		if(left) {
			System.out.println("left: Depth:"+depth_index+" Bit: 0");
			generateBits(false, depth_index+1, true, false);
			generateBits(false, depth_index+1, false, true);
			return;
		}
		
		if(right) {
			System.out.println("right: Depth:"+depth_index+" Bit: 1");
			generateBits(false, depth_index+1, true, false);
			generateBits(false, depth_index+1, false, true);
			return;
		}
	}
}
