package Exception_handling;

import java.util.Scanner;

public class unsupported_operation
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a first  number : ");
		int a=scn.nextInt();
		System.out.print("Enter a second  number : ");
		int b=scn.nextInt();
		System.out.print("Enter opeartor");
		char c=scn.next().charAt(0);
		try {
			switch(c)
			{
			case '+':System.out.print(a+b);
			break;
			case '-':System.out.print(a-b);
			break;
			case '*':System.out.print(a*b);
			break;
			case '/':System.out.print(a/b);
			break;
			default:throw new UnsupportedOperationException();
			}
		
			
		}
		catch(UnsupportedOperationException e)
		{
			System.out.print("Unsupported operation" );
		}
		


}
}
