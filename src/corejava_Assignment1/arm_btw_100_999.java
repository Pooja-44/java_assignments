package corejava_Assignment1;

public class arm_btw_100_999 
{
	public static void main(String args[])
	{
    for(int temp=100;temp<999;temp++)
	{
      int num=temp,rem=0,res=0;
       while(num!=0)
		{
          rem=num%10;
	      res+=Math.pow(rem, 3);
	      num/=10;
	     }
	if(temp==res)
	System.out.println(res);
	    
	}
  }
}


