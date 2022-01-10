import pkg.*;
import java.util.Scanner;
import java.util.Random;

class cat {
	public String name;
	
	public cat() {
		name = new String("Garfield");
	}
	
	public cat(String variable) {
		name = new String(variable);
	}
	
	public void meow() {
		System.out.println(name + " meows.");
		return;
	}

	}


class starter {
	public static void main(String args[]) {
		
		cat garCat = new cat();
		garCat.meow();
		cat bowCat = new cat("Bowser");
		bowCat.meow();
		

		
	}
}
