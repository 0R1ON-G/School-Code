import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		double rand_num2 = rand.nextDouble() + rand.nextInt(43) + 12.4;
		System.out.println(rand_num2);

	}
}
