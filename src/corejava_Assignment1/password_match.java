package corejava_Assignment1;

import java.util.Scanner;

public class password_match 
{
public static void main(String args[])
{
	
	Scanner scn=new Scanner(System.in);
	String username="pooja";
	String password="poo@44";
int count=0;
	
	do {
	System.out.println("Enter your username :");
	String user=scn.nextLine();
	System.out.println("password :");
	String pass=scn.nextLine();

	if(username.equals(user) && password.equals(pass))
	{
	System.out.println("welcome"+username);
	System.exit(0);
	}
	else
	{
		count++;
    }
	} while(count<3);
    System.out.print("contact your admin");
	System.exit(0);
}
}
