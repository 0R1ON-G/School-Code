import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int rando = 0;
		int odnar = rand.nextInt(150)+51;
		int[] arnold;
		int count;
		int min = 1000;
		int max = 1;
		arnold = new int[odnar];
		count = 0;
		int number = 0;
		
		while(count < arnold.length)
		{
			rando = rand.nextInt(100)+1;
			arnold[count] = rando;
			count++;
		}
		int f = 0;
		while(f < arnold.length) {
			System.out.println(arnold[f]);
			f++;
		}
		
		int c = 0;
		while(c < arnold.length)
		{
			if(arnold[c] < min)
			{
			min = arnold[c];
			}
		c++;
		}
		System.out.println("Minimum is " + min);
		
		int d = 0;
		while(d < arnold.length)
		{
			if(arnold[d] > max)
			{
			max = arnold[d];
			}
		d++;
		}
		System.out.println("Maximum is " + max);
		
		
	


		
	}
}
