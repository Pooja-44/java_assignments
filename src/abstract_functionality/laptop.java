package abstract_functionality;

public  abstract  class laptop
{
   abstract void start(); //if we declare method as abstract we should make class as abstract 
   abstract void shutdown();
   void display()
   {
	   System.out.print("abstract class can have concrete class");
   }
}

//public final abstract class  laptop
//{
//	abstract void  start();                      abstract class cannot be final
//	 abstract void shutdown();
//} 


//public private abstract class  laptop
//{
//	abstract void  start();                      abstract class cannot be private
//	 abstract void shutdown();
//} 

