class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int a = 4;
		int b = 3;
		int c = (a*b);
		int d = (a + b);
		
		int ans1 = (c*d%a+b);
		int ans2 = (((-a)+d)%c);
		int ans3 = (((-a)-(-b))*(c%d)+a);
		int ans4 = (((a/b)*c)-d);
		
		System.out.println("(c*d%a+b) = " + ans1);
		System.out.println("(((-a)+d)%c) = " + ans2);
		System.out.println("((a/b)*c)-d) = " + ans4);
		System.out.println("(((-a)-(-b))*(c%d)+a) = " + ans3);
		
		
		
	}
}
