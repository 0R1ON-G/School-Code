import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("Let's play the guessing game! Guess a number 1 to 1 Hundred! : ");
	
	int guess = sc.nextInt();
	int winner = rand.nextInt(100) + 1;
	
	if(guess == winner) {
		System.out.println("omg...you actually got it!");
	}
	else if(guess > winner) {
		System.out.println("You've guessed too big!");
	}
	else if(guess < winner) {
		System.out.println("You've guessed too low!");
	}
	
	
	System.out.println("The winner was: " + winner);
	
	}
	
}
