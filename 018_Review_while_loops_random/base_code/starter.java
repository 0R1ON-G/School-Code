import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("You must guess the number I am thinking of...it is betweeen 1 and 1000!!!");
		int guess = sc.nextInt();
		int c = 2;
		int secret = rand.nextInt(1000) + 1;
		
		while(secret != guess) {
			System.out.println("Wrong!!! Guess again...");
			guess = sc.nextInt();
			sc.nextLine();
			if(guess == secret) {
			System.out.println("You have won...");
			}
			if(c == 5) {
				break;
			}
			c = c+1;
		}
		System.out.println("Feel like giving up yet? (yes/no)");
		String choice = sc.nextLine();
		int d = 1;
		if(choice.equals("yes")) {
			System.out.println("Ha! I have bested you! The number was: " + secret);
		}
		if(choice.equals("no")) { 
			System.out.println("Okay...I see you are commited...");
			while(secret != guess) {
				System.out.println("Guess again...");
				guess = sc.nextInt();
				sc.nextLine();
				if(guess == secret) {
				System.out.println("You have won...");
				}
				if(d == 10) {
					break;
				}
				d = d+1;
			}
		}
		if(choice.equals("no")) {
			System.out.println("Your dedication is inspiring...I shall provide assisance.");
		}
		while((secret != guess) && (choice.equals("no"))) {
			if(guess > secret) {
				System.out.println("You're too high...guess again!");
				guess = sc.nextInt();
				sc.nextLine();
			}
			if(guess < secret) {
				System.out.println("You're too low...guess again");
				guess = sc.nextInt();
				sc.nextLine();
			}
			if(guess == secret) {
				System.out.println("YOU DID IT! The number was: " + secret);
			}
		}
		
}
}
