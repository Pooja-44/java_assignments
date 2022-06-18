package abstract_class;

public class findshape 
{
	public static void main(String args[])
	{
		shape s;
		s=new line();
		s.draw();
		s=new rectangle();
		s.draw();
		s=new cube();
		s.draw();
		
	}

}
