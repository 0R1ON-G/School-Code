import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Please input the following pieces of inforation as prompted.");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Name confirmed: " + name);
		System.out.println("Age: ");
		int age = sc.nextInt();
		System.out.println("Age confirmed: " + age);
		System.out.println("Birth Month (1-12): ");
		int month = sc.nextInt();
		System.out.println("Birth Day (1-31): ");
		int day = sc.nextInt();
		System.out.println("Birth Year (1900-2021): ");
		int year = sc.nextInt();
		System.out.println("Birth date confirmed: " + month + "/" + day + "/" + year);
		System.out.println("How much is a buck 50?");
		double number = sc.nextDouble();
		System.out.println("Yeah..." + number + "...that sounds right");
	}
}
