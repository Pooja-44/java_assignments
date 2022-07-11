package collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.*;


public class Main_q2
{
	

public static void main(String args[])
{

	TreeMap<contact,Long> t=new TreeMap<contact,Long>(new sortByPhone());
	
	t.put(new contact("pooja",6, "pooja@gmail.com","female"),(long) 101);
	t.put(new contact("druthi",4, "poja@gmail.com","female"),(long) 102);
	t.put(new contact("srusti",2, "pja@gmail.com","female"),(long) 103);
	t.put(new contact("prakruthi",1, "poooja@gmail.com","female"),(long) 104);
	
//	System.out.println(t.toString());
	
	for(Map.Entry<contact, Long> m: t. entrySet())
	{
	System.out.print(m.getKey());
	System.out.print(m.getValue());
	}
	
	
	
}
}
class  sortByPhone  implements Comparator<contact>
{

	@Override
	public int compare(contact o1, contact o2)
	{
		if (o1.phonenumber<o2.phonenumber)
			return 1;
		else
			return -1;
	}



}
class sortbyname implements Comparator<contact>
{

	@Override
	public int compare(contact o1, contact o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
			
			
	}
	
}
class contact
{
	String name;
	long phonenumber;
	String email;

	String gender;
	
	public contact(String name, long phonenumber, String email, String gender) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "contact [name=" + name + ", phonenumber=" + phonenumber + ", email=" + email + ", gender=" + gender
				+ "]"+"\n";
	}
	
	
	
}
