import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("Let's play the lottery! Guess a number 1 to 1 Million! : ");
	
	int guess = sc.nextInt();
	int winner = rand.nextInt(1000000) + 1;
	
	if(guess == winner) {
		System.out.println("HOLY FUCK YOU WON!!!");
	}
	else {
		System.out.println("You lost...fls bad man");
	}
	
	System.out.println("The winner was: " + winner);
	
	}
}
