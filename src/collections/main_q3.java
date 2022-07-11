package collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class main_q3 
{
	public static void main(String args[])
	{
		
		
		
	
		
		Scanner scn=new Scanner(System.in);
		System.out.println("select field for sort");
		System.out.println("a.id"+"\n"+"b.name"+"\n"+"c.department"+"\n"+"d.salary");
		char choose=scn.next().charAt(0);
		
		switch(choose)
		{
		case 'a': TreeSet<emp> emp1=new TreeSet<emp>(new sortbyid());
		           emp1.add(new emp(1, "pooja", "sales", 800000));
		           emp1.add(new emp(5, "aooja", "IT", 100000));
		           emp1.add(new emp(3, "zooja", "HR", 700000));
		           System.out.print(emp1);
		           break;
		           
		case 'b': TreeSet<emp> emp2=new TreeSet<emp>(new name());
        emp2.add(new emp(1, "pooja", "sales", 800000));
        emp2.add(new emp(2, "aooja", "IT", 100000));
        emp2.add(new emp(3, "zooja", "HR", 700000));
        System.out.print(emp2);
        break;
		case 'c': TreeSet<emp> emp3=new TreeSet<emp>(new sortbydep());
        emp3.add(new emp(1, "pooja", "sales", 800000));
        emp3.add(new emp(2, "aooja", "IT", 100000));
        emp3.add(new emp(3, "zooja", "HR", 700000));
        System.out.print(emp3);
        break;
		case 'd': TreeSet<emp> emp4=new TreeSet<emp>(new sortbysal());
        emp4.add(new emp(1, "pooja", "sales", 800000));
        emp4.add(new emp(2, "aooja", "IT", 100000));
        emp4.add(new emp(3, "zooja", "HR", 700000));
        System.out.print(emp4);
        break;         
	
		}
				
		
		
		
		
	}

}

class sortbyid implements Comparator<emp>
{
	
	@Override
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
	
}

class name implements Comparator<emp>
{

	@Override
	public int compare(emp o1, emp o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}

class sortbydep implements Comparator<emp>
{

	@Override
	public int compare(emp o1, emp o2) {
	
		return o1.name.compareTo(o2.name);
	}
	
}

class sortbysal implements Comparator<emp>
{

	@Override
	public int compare(emp o1, emp o2) {
		return o1.id-o2.id;
	}
	
}


class emp
{
	int id;
	String name;
	String dept;
	double salary;
	public emp(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
