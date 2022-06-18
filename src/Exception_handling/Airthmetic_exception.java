package Exception_handling;

import java.util.Scanner;

public class Airthmetic_exception 
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a first  number : ");
		int a=scn.nextInt();
		System.out.print("Enter a second  number : ");
		int b=scn.nextInt();
		try {
			System.out.print(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.print("cannot devided by 0 ");
		}
				
	}

}
