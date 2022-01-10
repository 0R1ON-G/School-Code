package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public Scanner sc = new Scanner(System.in);
	public String role;
	public String character;
	public String strength;
	public String health;
	public String epicness;
	public int strength1;
	public int epicness1;

	public BaseClass() {
		role = new String("No Role");
		strength = new String("Your strength is: 0");
		health = new String("Your health is: 0");
		epicness = new String("Your epicness is: 0");
	}
	
	public BaseClass(String role) {
		strength = new String("Your strength is: 0");
		health = new String("Your health is: 0");
		epicness = new String("Your epicness is: 0");
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
	}
	
}


