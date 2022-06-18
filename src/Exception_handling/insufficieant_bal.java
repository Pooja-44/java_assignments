package Exception_handling;

import java.util.Scanner;

public class insufficieant_bal
{
	
	long id;
	double balance=5000;
	
	double withdraw(double amount)
	{
	try {
		   if(amount<0)
		   {
			   throw new ArithmeticException();
			   
		   }
		   else	if (amount<balance )
			{
				balance-=amount;
			return balance;		
				
			}
		else
		{
			throw new Exception();
		}
	}
	catch(ArithmeticException e1)
	{
		System.out.println("Illigal bank transaction");
	}
	catch(Exception e)
	   {
		System.out.println("Insufficient balance");
		}
		
	return balance;
		
	}
	
	
	double deposit(double amount)
	{
		balance+=amount;
		return balance;
		
	}
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		   insufficieant_bal i=new    insufficieant_bal();
		   while(true) {
		System.out.println("1.withdraw");
		System.out.println("2.deposit");
		System.out.println("3.balance");
		System.out.println("Enter your choice");
	    int choice=scn.nextInt();
	    switch(choice)
	    {
	    
	    case 1: System.out.println("Enter amount");
	            double amount=scn.nextDouble();
	           System.out.println("balance"+ i.withdraw(amount));
	           break;
	    case 2:System.out.print("Enter amount");
                double amount1=scn.nextDouble();
               System.out.println( "balance :"+ i.deposit(amount1));
               break;
	    case 3:System.out.println(i.balance);
	    break;
	    
	    }
		
		
	}

}
}
