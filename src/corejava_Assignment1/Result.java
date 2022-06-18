package corejava_Assignment1;

public class Result {
	public static void main(String args[])
	{
		int sub1=100;
		int sub2=50;
	    int sub3=50;
	
	 if((sub1>60 && sub2<60 && sub3<60) ||( sub2>60 && sub1<60 && sub3<60)|| ( sub3>60 && sub1<60 && sub2<60))
		    System.out.print("fail");
	 else if(sub1>=60 &&  sub2 >=60 && sub3>=60 )
		System.out.print("pass");
	   
	 else  
	    	System.out.print("promted");
	 
	    
	}

}
