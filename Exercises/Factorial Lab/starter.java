import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give me a number and I will find the Factorial of that number: ");
		int input = sc.nextInt();
		int factor = input;
		int c = input;
		int count = 1;
		while(true) {
			c = c -1;
			factor = factor*c;
			if(count == input-1){
				break;
			}
			count = count + 1;
		}
		System.out.println("Factor is: " + factor);


		
	}
}
