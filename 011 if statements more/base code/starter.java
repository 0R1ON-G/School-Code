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
		
		if(num1 == num2) {
			System.out.println("You not very creative are you...");
		}
		
		if(num1 != num2) {
				System.out.println("Wow you followed directions...what a sheep");
		}
	}
}
