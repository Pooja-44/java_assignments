package lamda;
@FunctionalInterface
interface add
{
	int adding(int a,int b);

}
interface sub
{
	int substract(int a,int b);
}
interface mul
{
	int multiplication(int a,int b);
}
interface div
{
	int division(int a,int b);
}
public class calculator_q1 
{
	public static void main(String args[])
	{
   add sum=(int a,int b)->a+b;
   System.out.println("Sum of  "+ sum.adding(2,3));
   
   sub s=(int a,int b)->a-b;
   System.out.println("Sub of  "+s.substract(5, 2));
   
   mul m=(int a,int b)->a*b;
   System.out.println("Multiplication of  "+m.multiplication(5, 2));
   
  
   div d=(int a,int b)->a/b;
   System.out.println("division of  "+d.division(5, 2));
   
   
   
   
	}
}
