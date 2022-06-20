package generics;

import java.util.HashSet;

public class emp_hashset 
{
	
	private int id;
    private	String name;
    private	double salary;
	emp_hashset (int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
		
	}
	public static void main(String args[])
	{
		HashSet<emp_hashset> h=new HashSet<>();
		emp_hashset e=new emp_hashset (101,"pooja",50000);
		other o=new other(60);
		h.add(e);
//		h.add(o) we cannot add other object to employee hashset
	e.display();
	}

}
