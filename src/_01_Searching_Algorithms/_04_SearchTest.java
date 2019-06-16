package _01_Searching_Algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] test = {"Hello", "World"}; 
		String[] test2 = {"Apple", "Banana", "Pineapple"}; 
		String[] test3 = {"Cucumber", "Carrot", "Lettuce", "Tomato"}; 
		assertEquals(1, _00_LinearSearch.linearSearch(test, "World"));
		assertEquals(1, _00_LinearSearch.linearSearch(test2, "Banana"));
		assertEquals(0, _00_LinearSearch.linearSearch(test3, "Cucumber"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] test = {5, 7};
		int[] test2 = {5, 7, 9}; 
		int[] test3 = {5, 7, 9, 11}; 
		assertEquals(0, _01_BinarySearch.binarySearch(test, 0, 1, 5));
		assertEquals(1, _01_BinarySearch.binarySearch(test2, 0, 2, 7));
		assertEquals(2, _01_BinarySearch.binarySearch(test3, 0, 3, 9));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] test = {1, 2};
		int[] test2 = {1, 2, 3}; 
		int[] test3 = {1, 2, 3, 4}; 
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(test, 2));
		assertEquals(0, _02_InterpolationSearch.interpolationSearch(test2, 1));
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(test3, 3));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
