import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Date;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Okay, talk to me. \n");
		String a = sc.nextLine();
		System.out.print("Well \t Well \t Well \t ...isn\'t that something\n");
		String b = sc.nextLine();
		System.out.print("\"" + b + "\"\t Don't you sound dumb\n");
		String c = sc.nextLine();
		System.out.print("u mad seem like u getting mad\n");
		System.out.print("\t - TYPE STOP TO END.\n");
		String d = sc.nextLine();
		if(d.equals("Stop") || d.equals("stop")) {
			System.out.print("You Really fell for that!?\tl\tm\ta\to\n");
		}
		else {
			System.out.print("So you still want to talk...?\n");
		}
		System.out.print("Hey maybe you can help me...you know who\'s joe?\n");
		String e = sc.nextLine();
		if(e.equals("joe?") || e.equals("who?") || e.equals("Joe?") || e.equals("Who?")) {
			System.out.print("J\tO\tE\t\tM\tA\tM\tA\t\n");
			System.out.print("Gottem!\n");
		}
		else {
			System.out.print("Hmm as I thought...you are useless\n");
		}
		String f = sc.nextLine();
		System.out.print("Okay that was mean i guess...here's something to lift your spirits\n");
		Thread.sleep(1000);
		System.out.print("===\f===\f===\f===\f===\f===\f===\f===\f===\f===\f===\f===\n");
		System.out.print("It's a staircase!\n");
		System.out.print("SO\tYOU\tCAN\tLOSE\tSOME\tWEIGHT\n");
		System.out.print("Oh man this is too easy!!\n");
		


		
	}
}
