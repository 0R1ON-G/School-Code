import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int counter = 0;
		int counterr = 19;
		int[] arrayuno;
		arrayuno = new int[20];
		int[] arrayduo;
		arrayduo = new int[20];
		
		while(counter < 20) {
			arrayuno[counter] = rand.nextInt(50)+1;
			System.out.println("Number: " + counter + " = " + arrayuno[counter]);
			counter++;
			
		}
		
		System.out.println("\n");
		
		while(counterr >= 0) {
			arrayduo[counterr] = rand.nextInt(50)+1;
			System.out.println("Number: " + counterr + " = " + arrayduo[counterr]);
			counterr--;
		}


		
	}
}
