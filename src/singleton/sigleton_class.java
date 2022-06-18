package singleton;

public class sigleton_class
{
	
 static String  name;
 static String city;
  	
private	 sigleton_class(String name,String city)
	{
		this.name=name;
		this.city=city;
	}
	
	static  sigleton_class s=new sigleton_class("pooja ","chickmagalure");
	
	
	static sigleton_class getinstace()
	{
		return s;
	}
	

}
//singlton class should have static instance
//constructor should be private
//method should be  static and it should return object
