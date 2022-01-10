import java.util.Scanner;
import java.util.Random;


class starter {
	public static int primenum;
	
	public static boolean getPrime(int prime) {
		int counter = 1;
		int booleen = 0;
		boolean isprime = true;
		while(counter != prime) {
			if(counter == prime-1) {
				break;
			}
			counter = counter + 1;
			booleen = (prime%counter);
			
		
			if(booleen == 0) {
				isprime = false;
				break;
			}
			else if(booleen != 0) {
				isprime = true;
			}
		}
		
		return isprime;
	}
	public static int printPrimes(int primenum) {
		int count = 1;
		
		while(primenum >= count) {
			count = count + 1;
			getPrime(count);
			
			if(getPrime(count) == true) {
				System.out.println(count);
			}
			
		}
		return primenum;
	}
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("I will find all prime numbers leading up to the number you type: ");
	int inpnum = sc.nextInt();
	System.out.println("-------------------------------------------------------------");
	printPrimes(inpnum);
	
		
	}
}
