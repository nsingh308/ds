package org.recursion;

public class GenerateNLenghtStringsUsingCharacters {

	static final int DEPTH_REACHED = 2;
	static final char bits[] = { 'a', 'b', 'c' };

	public static void main(String arg[]) {
		int depth_index = 0;

		generateBits(true, depth_index, 'N');
	}

	private static void generateBits(boolean isIntialCall, int depth_index, char bit) {

		if (isIntialCall) {
			printBitOnScreen(depth_index, bit);
			for (char c : bits) {
				generateBits(false, depth_index, c);
			}
			return;
		}

		if (depth_index == DEPTH_REACHED) {
			return;
		}
		printBitOnScreen(depth_index, bit);
		for (char c : bits) {
			generateBits(false, depth_index + 1, c);
		}
		return;

	}

	private static void printBitOnScreen(int depth_index, char bit) {
		
		for (char c : bits) {
			if(c == bit) {
				System.out.println("Depth:" + depth_index+", "+bit+" side, Bit: " + bit);	
				break;
			}
			
		}
	}
}
