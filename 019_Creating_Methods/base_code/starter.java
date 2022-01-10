import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static String add(String a, String b){
		String x = a;
		String y = b;
		String full = (x + " " + y);
		return full;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Gimme a sentence: ");
		String sen1 = sc.nextLine(); 
		System.out.print("Gimme anther sentence: ");
		String sen2 = sc.nextLine();
		
		System.out.println(add(sen1,sen2));


		
	}
}
