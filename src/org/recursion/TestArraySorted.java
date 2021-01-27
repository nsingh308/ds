package org.recursion;

public class TestArraySorted {

	public static void main(String arg[]) {
		
		int my_array[] = {1, 2, 3, 4, 5, 6, 3};
		
		boolean status = checkIfSorted(my_array, 0);
		System.out.println("Array is:(true means sorted , false means unsorted): "+status);
		
	}

	private static boolean checkIfSorted(int[] my_array, int index) {
		if(index >= my_array.length-1 ) {
			return true;
		}
		
		if(my_array[index]< my_array[index+1]) {
			return checkIfSorted(my_array, index+1);
		}else {
			System.out.println("false");
			return false;
		}	
	}
}
