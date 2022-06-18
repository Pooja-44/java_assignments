package corejava_Assignment1;

import java.util.Scanner;

public class student 
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int k=0,e=0,h=0;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter your 3 subject marks");
			System.out.println("kannad :");
			int kmark=scn.nextInt();
			k+=kmark;
			System.out.println("English :");
			int emark=scn.nextInt();
			e+=emark;
			System.out.println("hindi:");
			int hmark=scn.nextInt();
			h+=hmark;
			int total=kmark+emark+hmark;
			double avg=total/3;
			System.out.println("Average:"+avg);
			
		}
		System.out.println("average of Kannada"+ k/3);
		System.out.println("average of English"+ e/3);
		System.out.println("average of Hondi"+ h/3);
		
		
		
	}

}
