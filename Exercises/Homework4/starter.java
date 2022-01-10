import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int bb = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		
		System.out.print("Gimme a number : ");
		int num1 = sc.nextInt();
		System.out.print("Give a new number : ");
		int num2 = sc.nextInt();
		
		if((num1 % 2) == 0) {
			System.out.println("Number 1 (" + num1 + ") is even");
		}
		else {
			System.out.println("Number 1 (" + num1 + ") is odd");
		}
		
		if((num2 % 2) == 0) {
			System.out.println("Number 2 (" + num2 + ") is even");
		}
		else {
			System.out.println("Number 2 (" + num2 + ") is odd");
		}
	
		if((num1 % 3) == 0) {
			System.out.println("Number 1 (" + num1 + ") is divisible by 3!");
		}
		else {
			a = 1;
		}
		
		if((num2 % 3) == 0) {
			System.out.println("Number 2 (" + num2 + ") is divisible by 3!");
		}
		else {
			bb = 1;
		}
		
		if((num1 % 4) == 0) {
			System.out.println("Number 1 (" + num1 + ") is divisible by 4!");
		}
		else {
			c = 1;
		}
		
		if((num2 % 4) == 0) {
			System.out.println("Number 2 (" + num2 + ") is divisible by 4!");
		}
		else {
			d = 1;
		}
		
		if((num1 % 5) == 0) {
			System.out.println("Number 1 (" + num1 + ") is divisible by 5!");
		}
		else {
			e = 1;
		}
		
		if((num2 % 5) == 0) {
			System.out.println("Number 2 (" + num2 + ") is divisible by 5!");
		}
		else {
			f = 1;
		}

		System.out.println("Number 1 (" + num1 + ") is NOT divisible by: ");
		
		if(a == 1) {
			System.out.print("3\n");
		}
		if(c == 1) {
			System.out.print("4\n");
		}
		if(e == 1) {
			System.out.print("5\n");
		}
		
		System.out.println("Number 2 (" + num2 + ") is NOT divisible by: ");
		
		if(bb == 1) {
			System.out.print("3\n");
		}
		if(d == 1) {
			System.out.print("4\n");
		}
		if(f == 1) {
			System.out.print("5\n");
		}
		
	
	}
}
