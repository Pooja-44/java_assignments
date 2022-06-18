package corejava_Assignment1;

public class amstrong_number
{
	public static void main(String args[])
	{
		int num=153;
		
		int res=0;
        int num1=num;
	while(num!=0)
		
		{
			
			int rem=num%10;
			res+=Math.pow(rem, 3);
			num=num/10;
			
		}
		
	if(res==num1)
		System.out.print("number is armstrong");
	else	
		System.out.print("number is not armstrong");
	
		
		
	}

}
