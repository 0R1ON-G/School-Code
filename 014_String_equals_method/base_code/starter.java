import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String prechosen;
		
		int number = rand.nextInt(3);
		
		if(number == 0) {
			prechosen = ("Wizard");
		}
		else if(number == 1) {
			prechosen = ("Warrior");
		}
		else {
			prechosen = ("Rogue");
		}
		
		System.out.println("You may chose your role: Wizard, Warrior, or Rogue ");
		String playerchose = sc.nextLine();
		System.out.println("Your selection is made: " + playerchose);
		
		if(playerchose.equals(prechosen)) {
			System.out.println("Your selection has been approved by the high council.");
		}
		else {
			System.out.println("The high council has other plans for you...they have decided you shall be a " + prechosen);
		}
		
		if((playerchose != ("Rogue")) && (playerchose != ("Warrior")) && (playerchose != ("Wizard"))) {
			System.out.println("You have not chosen correctly");
		}
			
		
		
	}
}
