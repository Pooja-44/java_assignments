package singleton;

public class noAccess   extends sigleton_class
{

	public static void main(String args[])
	{
		sigleton_class single=sigleton_class.getinstace();
		System.out.print(single.name+" "+single.city);
	}

}
// singleton_class  cannot be inherit bcz constructor is private
// we cannot access singleton class members in onother class directly, we  sholud cl some other method that should be return object then only
//we can access