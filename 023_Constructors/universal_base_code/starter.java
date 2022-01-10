import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		BaseClass norole = new BaseClass("No Role");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.print("Chose a role, you already know what the options are: ");
		String role = new String();
		role = sc.nextLine();
		
		if(role.equals("Warrior")) {
			BaseClass warrior = new BaseClass("Warrior");
		}
		else if(role.equals("Wizard")) {
			BaseClass wizard = new BaseClass("Wizard");
		}
		else if(role.equals("Rogue")) {
			BaseClass rogue = new BaseClass("Rogue");
		}
		else {
			BaseClass none = new BaseClass("No Role");
		}


		
	}
}
