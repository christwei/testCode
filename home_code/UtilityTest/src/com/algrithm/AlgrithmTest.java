package com.algrithm;

public class AlgrithmTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bubbleSort();
	}
	
	static void bubbleSort() {
		int[] array = {15,12,126,17,10,32};
		
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1;j < array.length; j++) {
				if (array[j] < array[i]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
	}
}
