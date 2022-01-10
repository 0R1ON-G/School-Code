import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Give word");
		String user = sc.nextLine();
		
		String[] array = new String[user.length()];
		
		int count = 0;
		
		while(count < user.length()) {
			if(count < user.length()-1) {
				array[count] = user.substring(count, count+1);
			}
			else {
				array[user.length()-1] = user.substring(user.length()-1);
			}
			count++;
		}
		
		int counter = 0;
		
		while(counter < user.length()) {
			int joe = rand.nextInt(user.length());
			System.out.print(array[joe]);
			counter++;
		}
		System.out.println();
	}
}
