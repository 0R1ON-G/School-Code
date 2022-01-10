import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int points = 25;
	
		
		System.out.println("You may chose your role: Wizard, Warrior, or Rogue ");
		String playerchose = sc.nextLine();
		System.out.println("Your selection is made: " + playerchose);
		
		System.out.println("You may now assign points towards you characters 5 ability catagories. You have " + points + " points to spend. The catagories add to 50 total points, but with only 25 to spend, employ smart spending! ");
		System.out.println("Strength (10 points max): ");
		int strength = sc.nextInt();
		int points1 = (points - strength);
		System.out.println("You have " + points1 + " points remaining");
		System.out.println("Dexterity (10 points max): ");
		int dexterity = sc.nextInt();
		int points2 = (points1 - dexterity);
		System.out.println("You now have " + points2 + " points remaining");
		System.out.println("Intelligence (10 points max): ");
		int intelligence = sc.nextInt();
		int points3 = (points2 - intelligence);
		System.out.println("You now have " + points3 + " points remaining");
		System.out.println("Constitution (10 points max): ");
		int constitution = sc.nextInt();
		int points4 = (points3 - constitution);
		System.out.println("You now have " + points4 + " points remaining");
		System.out.println("Charisma (Last catagory spend all your remaining points): ");
		int charisma = sc.nextInt();
		int points5 = (points4 - charisma);
		System.out.println("You have made your selections...");
		System.out.println("Your " + playerchose + " has the folowing stats:");
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Constitution: " + constitution);
		System.out.println("Charisma: " + charisma);
	}
}
