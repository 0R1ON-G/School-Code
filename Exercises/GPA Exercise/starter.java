import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's the name of the first class? - ");
		String P1 = sc.nextLine(); 
		System.out.print("What's grade value for class? - ");
		int G1 = sc.nextInt();
		
		System.out.print("What's the name of the second class? - ");
		sc.nextLine();
		String P2 = sc.nextLine(); 
		System.out.print("What's grade value for class? - ");
		int G2 = sc.nextInt();
		
		System.out.print("What's the name of the third class? - ");
		sc.nextLine();
		String P3 = sc.nextLine(); 
		System.out.print("What's grade value for class? - ");
		int G3 = sc.nextInt();
		
		System.out.print("What's the name of the fourth class? - ");
		sc.nextLine();
		String P4 = sc.nextLine(); 
		System.out.print("What's grade value for class? - ");
		int G4 = sc.nextInt();
		
		System.out.print("What's the name of the fifth class? - ");
		sc.nextLine();
		String P5 = sc.nextLine(); 
		System.out.print("What's grade value for class? - ");
		int G5 = sc.nextInt();
		
		
		double GPA = ((G1 + G2 + G3 + G4 + G5)/5);
		
		System.out.println(P1 + " - " + G1);
		System.out.println(P2 + " - " + G2);
		System.out.println(P3 + " - " + G3);
		System.out.println(P4 + " - " + G4);
		System.out.println(P5 + " - " + G5);
		System.out.println("Total GPA - " + GPA);
		
		
	}
}
