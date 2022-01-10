import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's the name? - ");
		String name = sc.nextLine();
		System.out.print("How many times should it print? - ");
		int num = sc.nextInt();
		int c = 0;
		
		while(true) 
		{
			System.out.print(name + " ");
			if(c == num)
			{
				break;
			}
			c = c + 1;
		}
		



		
	}
}
