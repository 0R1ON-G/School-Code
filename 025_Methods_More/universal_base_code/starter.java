import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static String setRole(String role) {
		
		if(role.equals("Warrior")) {
			System.out.println("Your role is now Warrior!");
		}
		else if(role.equals("Wizard")) {
			System.out.println("Your role is now Wizard!");
		}
		else if(role.equals("Rogue")) {
			System.out.println("Your role is now Rogue!");
		}
		else {
			System.out.println("No Role");
		}
		
		return role;
	}
	
	public static int setStrength(int strength) {
		System.out.println("Your strenth is now: " + strength);
		return strength;
	}
	
	public static int setIntelligence(int intelligence) {
		System.out.println("Your intelligence is now: " + intelligence);
		return intelligence;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Chose your role, you alread know the options... ");
		String role = sc.nextLine();
		setRole(role);
		
		System.out.print("How many points would you like to allocate towards Strength? ");
		int strength = sc.nextInt();
		sc.nextLine();
		setStrength(strength);
		
		System.out.print("How many points would you like to allocate towards intelligence? ");
		int intelligence = sc.nextInt();
		sc.nextLine();
		setIntelligence(intelligence);

	}
}

