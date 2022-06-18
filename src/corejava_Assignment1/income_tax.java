package corejava_Assignment1;

import java.util.Scanner;

public class income_tax
{
public static void main(String args[])
{
	Scanner scn=new Scanner(System.in);
	char slab;
	double tax=0;
	 System.out.print("Enter the Income");
	 double income=scn.nextDouble();
	 if(income>0 && income<180000)
	  slab='A';
	 else if(income>181000 && income<300000)
		slab='B';
	 else if(income>300000 && income<500000)
		 slab='C';
	 else 
		 slab='D';
		 
	
	switch(slab)
	{
	case 'A':System.out.print("NILL");
	         break;  
    case 'B':tax=income*10/100;
                 System.out.print("Tax :"+tax);
                 break;
    case 'C':tax=income*20/100;
                 System.out.print("Tax :"+tax);
                 break;
    case 'D':tax=income*30/100;
                   System.out.print("Tax :"+tax);
    
	
	}
}
}
