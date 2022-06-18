package string_builder;

public class insert_text_index 
{
	public static void main(String args[])
	{
		StringBuilder s1=new StringBuilder("it is used to  at the index position");
		s1.insert(14, "insert text");
		System.out.print(s1);
	}
}
