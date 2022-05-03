package boot;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		/* Get the nth number in the fibonacci sequence given n
		Alternatively given a number F, print out whether it's a fibonacci number and what the closest index n in the
		fibonacci sequence is.*/
		
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter n");
		int n=num.nextInt();
		System.out.println("EnterF:");
		int f=num.nextInt();
		
		if(f<0)
		{
			System.out.println("Please Enter Positve number");
		
		}
		else
		{
			
			int x=0, y=1, z=0;
			for(int i=2; i<=n; i++)
			{
			while(z<f)
			{
				z=x+y;
				x=y;
				y=z;
			}
			}
			if(z==f)
			{
				System.out.println(f+"is a Fibonacci");
			}
			else
				System.out.println(f+"not a Fibonacci and closest in sequence is"+z);
			
		}
		
		
	}

}
