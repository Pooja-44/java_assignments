
package corejava_Assignment1;

public class simple_intrest 
{

	public static void main(String args[])
	{
		double principle=4000;
		double rate=7;
		int time=2;
		double SI=principle*rate*time/100;
		System.out.println("Simple Intrest :"+SI);
		
		
		double CI=principle*Math.pow(1+rate/100,2)-principle;
		System.out.println("Compound intrest:"+CI);
		
	}
}
