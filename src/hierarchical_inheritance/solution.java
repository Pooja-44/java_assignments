package hierarchical_inheritance;

public class solution
{
	public static void main(String args[])
	{
  
//	super class reference	
		employee e;  
		e=new employee();
		e.work();
//		sub class object (upcasting)
	   e=new manager();
	   e.work();
	   e=new labour();
	   e.work();
	 
	  
	   
	}

}
