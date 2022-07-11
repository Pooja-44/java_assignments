package lamda;

import java.util.ArrayList;
import java.util.List;

public class remove_odd_len_q4 
{
	public static void main(String args[])
	{
		List<String> words=new ArrayList<String>();
		words.add("hii");
		words.add("hello");
		words.add("priy");
		words.add("pooj");
		words.add("pooja");
		
		 words.removeIf(i -> i.length()%2 ==0);
		 System.out.print(words);
	}

}
