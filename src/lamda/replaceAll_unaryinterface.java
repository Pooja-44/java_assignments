package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class sample implements UnaryOperator<String>
{

	@Override
	public String apply(String t) 
	{
	
		return t.toUpperCase();
	}
	
}
public class replaceAll_unaryinterface
{
	public static void main(String args[])
	{
	List<String> s=new ArrayList<>();
	s.add("java");
	s.add("python");
	s.add("javascript");
	s.add("rubby");
	 
	s.replaceAll(new sample());
	System.out.print(s);
	
	}

}
