import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick a number, any number!: ");
		int num1 = sc.nextInt();
		
		System.out.println("Pick another number, it better be a different number!: ");
		int num2 = sc.nextInt();
		
		System.out.println("Pick another number, it better be a brand new number!: ");
		int num3 = sc.nextInt();
		
		if((num1 > num2) && (num1 > num2)) {
			System.out.println(num1 + " : This is the largest number!");
		}
		if((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " : This is the largest number!");
		}
		if((num3 > num1) && (num3 > num2)) {
			System.out.println(num3 + " : This is the largest number!");
		}
		
		if((num1 < num2) && (num1 < num3)) {
			System.out.println(num1 + " : This is the smallest number!");
		}
		if((num2 < num1) && (num2 < num3)) {
			System.out.println(num2 + " : This is the smallest number!");
		}
		if((num3 < num1) && (num3 < num2)) {
			System.out.println(num3 + " : This is the smallest number!");
		}
		
	}
}
