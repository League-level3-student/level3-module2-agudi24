package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	int count = 0;
	@Override
	void sort(int[] array, SortingVisualizer display) {
		count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if(array[i + 1] > array[i]) {
				count++;
				display.updateDisplay();
			}
			display.updateDisplay();
		}
		if(count == array.length - 1) {
			System.out.println("Finished");
			display.updateDisplay();
		}
		else {
			Random r = new Random();
			int r1 = r.nextInt(array.length - 1);
			int r2 = r.nextInt(array.length - 1);
			int temp = array[r1];
			array[r1] = array[r2];
			array[r2] = temp;
			display.updateDisplay();
		}
		display.updateDisplay();
		sort(array, display);
	}	
}
