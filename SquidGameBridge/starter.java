import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("\n");
		System.out.println("READ RULES:\n");
		System.out.println("Welome to Squid Game Bridge...");
		System.out.println("Your goal is to cross the bridge. The bridge is made up of 18 rows.");
		System.out.println("Each row has 2 Glass Tiles, one on the left, one on the right. ");
		System.out.println("For each row chose either left side or right side.");
		System.out.println("And be careful. Only 1 Glass Tile in each row will hold your weight.\n");
		System.out.println("To aid you in this impossible task you have several perks: ");
		System.out.println("Glass Maker: You can see the correct tile to chose. - (1 Use)");
		System.out.println("Shoe Throw: You throw your shoes at a tile to test it. - (2 Uses)");
		System.out.println("Sacrafice: You push another player over, killing them, but their sacrafice shows the way. - (1 Use)");
		System.out.println("Coin Flip: If you can't chose left or right, flip a coin to chose for you. (Multiple Uses)\n");
		System.out.println("=========================================================================\n");
		
		int counter = 0;
		int choice = 2;
		int glass = 0;
		String LrR = new String();
		
		int perkGlass = 0;
		int perkSacrafice = 0;
		int shoeCount = 0;
		int coinFlip = 2;
		
		String chose = new String();
		System.out.print("Type START to Play the Game. - ");
		String retry = sc.nextLine();
		System.out.println("");
		
		while(retry.equals("yes") || retry.equals("Yes") || retry.equals("START") || retry.equals("start") || retry.equals("Start")) {
			
			while(counter <= 18) {
				counter = counter + 1;
				if(counter == 18) {
					System.out.println("You made it across the entire bridge!");
					break;
				}
				System.out.print("Row " + counter + ": Chose either Left or Right (Or type a perk to use it) - ");
				chose = sc.nextLine();
				System.out.print("\n");
				
				// Assigns User String Input to Int for later Use. 
				if(chose.equals("Left") || chose.equals("left")) {
					choice = 0;
				}
				else if(chose.equals("Right") || chose.equals("right")) {
					choice = 1;
				}
				else if(chose.equals("Glass Maker") || chose.equals("Glass maker") || chose.equals("glass maker")) {
					choice = 3;
					
				}
				else if(chose.equals("Shoe Throw") || chose.equals("shoe throw") || chose.equals("Shoe throw")) {
					choice = 4;
				}
				else if(chose.equals("Sacrafice") || chose.equals("sacrafice")) {
					choice = 5;
				}
				else if(chose.equals("Coin Flip") || chose.equals("Coin flip") || chose.equals("coin flip")) {
					choice = 6;
				}
				else if(chose.equals("Show Perks") || chose.equals("Show perks") || chose.equals("show perks")) {
					choice = 7;
				}
				else {
					choice = 2;
				}
				
				// Choses Glass Tile That Breaks. And Assigns the number to Left or Right. 
				glass = rand.nextInt(2);
				if(glass == 0) {
					LrR = "Left";
				}
				else if(glass == 0) {
					LrR = "Right";
				}
				// Compares Player Input To Random Glass Chosen.
				if(choice == glass) {
					System.out.println("You're safe on that one.\n");
				}
				// Glass Maker Perk Operation.
				else if((choice == 3) && (perkGlass == 0)) {
					System.out.println("-      You can see a strange shimmer in the " + LrR + " tile. And jump to it safely.\n");
					choice = glass;
					perkGlass = 1;
				}
				else if((choice == 3) && (perkGlass == 1)) {
					System.out.println("-      You have already used this perk please try again.\n");
					counter = counter - 1;
				}
				// Shoes Perk Operation. 
				else if(choice == 4 && shoeCount <= 1) {
					shoeCount = shoeCount + 1;
					System.out.print("-      What tile (left/right) would you like to throw your shoe at? - ");
					chose = sc.nextLine();
					System.out.print("\n");
					if(chose.equals(LrR)) {
						System.out.println("-      Your shoe bounces off of the " + LrR + " tile without breaking it. You jump to that tile safely.\n");
					}
					else {
						System.out.println("-      Your shoe crashes through the " + chose + " tile. You jump to the opposite safely.\n");
					}
				}
				else if(choice == 4 && shoeCount >= 2) {
					System.out.println("-      You've ran out of shoes! Please try again.\n");
				}
				// Sacrafice Perk Operation.
				else if(choice == 5 && perkSacrafice == 0) {
					System.out.println("-      You push the player infront of you. They break the next tile, and you cross safely.\n");
					perkSacrafice = 1;
				}
				else if(choice == 5 && perkSacrafice == 1) {
					System.out.println("-      There's no one in front of you any more! Try again.\n");
					counter = counter-1;
				}
				// Coin Flip Operation.
				else if(choice == 6) {
					coinFlip = rand.nextInt(2);
					if(coinFlip == glass) {
						System.out.println("-      God is watching over you...The coin flip was correct.\n");
					}
					else {
						System.out.println("YOU DIED.\n");
						System.out.println("Game Stats: ");
						System.out.println("Tiles Crossed: " + (counter-1) + " / 18");
						System.out.print("\n");
						System.out.println("---------------------------------------------------------------\n");
						break;
					}
				}
				// Show Perks Operation.
				else if(choice == 7) {
					System.out.println("Here are all of the perks: ");
					System.out.println("Glass Maker: You can see the correct tile to chose. - (1 Use)");
					System.out.println("Shoe Throw: You throw your shoes at a tile to test it. - (2 Uses)");
					System.out.println("Sacrafice: You push another player over, killing them, but their sacrafice shows the way. - (1 Use)");
					System.out.println("Coin Flip: If you can't chose left or right, flip a coin to chose for you. (Multiple Uses)\n");
				
					counter = counter - 1;
				}
				// Game Over Operation. 
				else if(choice != glass && (choice == 1 || choice == 0 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7)) {
					System.out.println("YOU DIED.\n");
					System.out.println("Game Stats: ");
					System.out.println("Tiles Crossed: " + (counter-1) + " / 18");
					System.out.print("\n");
					System.out.println("---------------------------------------------------------------\n");
					break;
				}
				else {
					System.out.println("There has been an error...try again.\n");
					counter = counter - 1;
				}
			}
			
			System.out.print("Would you like to play again? : ");
			retry = sc.nextLine();
			while(!"yes".equals(retry) || !"Yes".equals(retry)) {
				if("yes".equals(retry) || "Yes".equals(retry) || "no".equals(retry) || "No".equals(retry)) {
					break;
				}
				System.out.print("Error.\n");
				System.out.println("Would you like to play again? : ");
				retry = sc.nextLine();
			}
			System.out.print("\n");
			System.out.println("=======================================================================\n");
			counter = 0;
			perkGlass = 0;
			perkSacrafice = 0;
			shoeCount = 0;
			coinFlip = 2;
		}
		
		while(retry.equals("0456")) {
			System.out.println("Secret Code Initialized.");
			System.out.println("Starting new Game...");
			System.out.println("==========================================================================\n");
			int playernum = rand.nextInt(250)+10;
			String playername = new String("0" + playernum);
			int count = 0;
			int playercount = 1;
			int aichoose = 2;
			int tile = 2;
			String direction = new String();
			while(count <= 18) {
				while(playercount <= 18) {
					if(playercount < 18) {
						break;
					}
					tile = rand.nextInt(2);
					if(tile == 0) {
						direction = ("Left");
					}
					else {
						direction = ("Right");
					}
					System.out.println("Player " + playername + "'s turn: ");
					aichoose = rand.nextInt(2);
					if(aichoose == tile) {
						System.out.println(playername + " chose : " + direction);
						System.out.println("     *safe*");
						System.out.println("");
					}
					else {
						System.out.println(playername + " chose : " + direction);
						System.out.println("     *dies*");
						System.out.println("");
						playernum = rand.nextInt(250)+10;
						playername = ("0" + playernum);
					}
					
					
				}
			}
		}
		


		
	}
}
