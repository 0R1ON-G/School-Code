import java.util.Scanner;
import java.util.Random;

class Wizard{
	String wizard = new String("Wizard");
	String strength = new String("Strength: 5");
	String smarts = new String("Smarts: 5");
	String abilities = new String("Abilities: 5");
	String mobility = new String("Mobility: 3");
}

class starter {
	public static void main(String args[]) {
		Wizard myWiz = new Wizard();
		
		System.out.println(myWiz.wizard);
		System.out.println(myWiz.strength);
		System.out.println(myWiz.smarts);
		System.out.println(myWiz.abilities);
		System.out.println(myWiz.mobility);


		
	}
}
