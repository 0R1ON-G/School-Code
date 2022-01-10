import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int counter = 1;
		int rando = 0;
		
		while(counter <= 100) {
			rando = rand.nextInt(100) +1;
			System.out.println("Number " + counter + ": " + rando);
			counter = counter +1;
			
		}


		
	}
}
