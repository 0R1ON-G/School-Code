import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Put in a number and I'll add 4 to it: ");
		int number = sc.nextInt();
		System.out.println(number);
		System.out.println(number + 1);
		System.out.println(number + 2);
		System.out.println(number + 3);
		System.out.println(number + 4);
	}
}