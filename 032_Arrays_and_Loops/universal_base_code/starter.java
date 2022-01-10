import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arnold;
		int count;
		arnold = new int[1000];
		count = 0;
		int number = 0;
		while(count < arnold.length)
		{
			arnold[count] = 0;
			count = count +1;
		}
		
		while(number < arnold.length) {
			System.out.println(arnold[number]);
			number++;
		}


		
	}
}
