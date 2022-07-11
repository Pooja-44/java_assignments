package java11_features;

@FunctionalInterface
interface simple_intrest
{
	Double simplei(double p,int t,double r);
}
public class q1_simple_intrest 
{
	
	public static void main(String args[])
	{
		simple_intrest s=(double p,int t,double r)->p*t*r/100;
	      System.out.print(  s.simplei(20000, 5, 12));
   
}
}