package maccess;

import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args) {
		/*int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int index = Arrays.binarySearch(numbers, 4);

		
		System.out.println("The Index of element 4 in the array is "+index);*/
		
		Integer[] numbers = {10,15,65,87,95,45,36};
		Arrays.sort(numbers);
		
		Arrays.fill(numbers, 12);
		
		for(int i: numbers) 
		{
			System.out.print(i+" ");
		}
	}

}
