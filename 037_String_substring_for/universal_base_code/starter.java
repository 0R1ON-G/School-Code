import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some word: ");
		String word = sc.nextLine();
		
		for(int c = 0; c < word.length(); c++) {
			System.out.println(word.substring(c,c+1));
		}


		
	}
}
