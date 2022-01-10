import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int loto1;
		int loto2;
		int loto3;
		String playerchose = new String();
		int bigmoney = 100;
		int wager;
		System.out.println("Players begin with $100 to use during the game.");
		System.out.println("3 numbers (1-10) are drawn at random.");
		System.out.println("Players must determine how much they wish to wager each round.\n");
		System.out.println("If 2 of the numbers drawn are the same the wager is doubled.");
		System.out.println("If all 3 of the numbers drawn are the same the wager is trippled.");
		System.out.println("If none of the numbers drawn are the same the wager is lost.\n");
		System.out.println("--------------------------------------------------------------\n");
		
		while(bigmoney > 0) {
			System.out.print("Player...would you like to gamble? (Yes, No, Y, N): ");
			playerchose = sc.nextLine();
			if(playerchose.equals("Yes") || playerchose.equals("y") || playerchose.equals("Y") || playerchose.equals("yes")) {
				System.out.print("Player, how much are you willing to wager?: $");
				wager = sc.nextInt();
				sc.nextLine();
				if((wager < 0) || (wager > bigmoney) || (wager == 0)) {
					System.out.println("Player, please input a valid wager.\n");
				}
				else {
				bigmoney = bigmoney - wager;
				loto1 = rand.nextInt(3)+1;
				loto2 = rand.nextInt(3)+1;
				loto3 = rand.nextInt(3)+1;
				System.out.println("\nRolling the numbers now...");
				System.out.println("---------------------------------");
				System.out.println("|  " + loto1 + "  |  " + loto2 + "  |  " + loto3 + "  |");
				System.out.println("---------------------------------");
				if((loto1 == loto2) && (loto1 == loto3) && (loto2 == loto3)) {
					System.out.println("All 3 of the number are the same. The player has trippled their bet.");
					bigmoney = bigmoney + (wager*3);
					System.out.println("Player now has a total of: $" + bigmoney + "\n");
				}
				else if((loto1 == loto2) || (loto1 == loto3) || (loto2 == loto3)) {
					System.out.println("2 of the numbers are the same. The player has doubled their bet.");
					bigmoney = bigmoney + (wager*2);
					System.out.println("Player now has a total of: $" + bigmoney + "\n");
				}
				else {
					System.out.println("None of the numbers are the same. The player has lost their bet.");
					System.out.println("Player now has a total of: $" + bigmoney + "\n");
				}
				}
			}
			if(playerchose.equals("No") || playerchose.equals("no") || playerchose.equals("N") || playerchose.equals("n")) {
				break;
			}
		}
		System.out.println("\nThe game has ended.");
		System.out.println("Player has: $" + bigmoney);
		if(bigmoney < 0) {
			System.out.println("Player lost: $"+ (bigmoney - 100));
		}
		else {
			System.out.println("Player won: $"+ (bigmoney - 100));
		}


		
	}
}
