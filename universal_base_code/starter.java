import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	public static void toStringArray(int []x) {
		int counter = 0;
		while(counter < x.length) {
			System.out.print(x[counter] + "  ");
			counter++;
		}
		System.out.println();
	}
	public static void getArrayAverage(int []x) {
		int total = 0;
		int upward = 0;
		while(upward < x.length) {
			total = total + x[upward];
			upward++;
		}
		System.out.print("Average is : " + total/x.length);
		System.out.println();
		
	}
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int count = 0;
		int[] array = new int[10];
		while(count < array.length) {
			array[count] = rand.nextInt(10)+1;
			count++;
		}
		
		
		System.out.println("String array method outputs all the numbers: ");
		toStringArray(array);
		System.out.println("Average array method outputs the average value in array: ");
		getArrayAverage(array);
		


		
	}
}
