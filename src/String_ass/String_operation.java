package String_ass;

public class String_operation 
{
public static void main(String args[])
{
	String str1=new String("java String pool refers to collection of which stored in heap memory");
	 String str="java String pool refers to collection of which stored in heap memory";
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	
	String rep=		str.replace('a', '$');
			System.out.println(rep);
	System.out.println(str.contains("collection"));
	System.out.println(str.equals(rep));
	

	
}
}

