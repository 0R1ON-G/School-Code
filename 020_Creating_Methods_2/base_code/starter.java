import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int a, int b){
		int x = a;
		int y = b;
		int c = 1;
		int z = 1;
		while(true) 
		{
			z = z*a;
			if(c == y)
			{
				break;
			}
			c = c + 1;
		}
		return z;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Gimme a number: ");
		int num1 = sc.nextInt();
		System.out.print("Gimme twond number: ");
		sc.nextLine();
		int num2 = sc.nextInt();
		
		System.out.println(pow(num1,num2));



		
	}
}
