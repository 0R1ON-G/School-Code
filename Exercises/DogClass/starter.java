import pkg.*;
import java.util.Scanner;
import java.util.Random;

class dog {
	public String name;
	public int age; 
	public String breed;
	
	public dog() {
		name = new String("Clifford");
		age = 3;
		breed = new String("big red dog");
	}
	
	public dog(String namee) {
		name = new String(namee);
		age = 1;
		breed = new String("dog dog");
	}
	
	public dog(String namee, int agee) {
		name = new String(namee);
		age = agee;
		breed = new String("dog dog");
	}
	
	public dog(String namee, String breeed) {
		name = new String(namee);
		breed = new String(breeed);
		age = 1;
	}
	
	public void setName(String namee) {
		name = new String(namee);
	}
	
	public void setAge(int agee) {
		age = agee;
	}
	
	public void setBreed(String breeed) {
		breed = new String(breeed);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		boolean sleep;
		Random rand = new Random();
		int rand1 = rand.nextInt(2);
		if(rand1 == 0) {
			sleep = false;
		}
		else {
			sleep = true;
		}
		return sleep;
	}
	
	public void bark() {
		System.out.println(name + " borks!");
	}
	
}


class starter {
	public static void main(String args[]) {
		dog aDog = new dog("Pupper", 5);
		boolean sleepy = aDog.isSleeping();
		int numbr = 0;
		if(sleepy == true) {
			System.out.println(aDog.getName() + " is sleeping");
			numbr = 1;
		}
		else if(sleepy == false) {
			aDog.bark();
			numbr = 2;
		}
		
		dog bDog = new dog("Steve", "Shiba");
		boolean sleepyy = bDog.isSleeping();
		if(numbr == 2) {
			bDog.bark();
		}
		else if((numbr == 2) || sleepyy == false) {
			System.out.println(bDog.getName() + " sleeps peacefully");
		}
		else {
			System.out.println(bDog.getName() + " does nothing");
		}
		


		
	}
}
