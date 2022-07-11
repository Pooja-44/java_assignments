package collections;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist_q4
{
public static void main(String args[])
{
	SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
	LinkedList<Date> l=new LinkedList<>();
	Date d=new Date(2014,05,09)
	l.add(new man(d));
       
	
	
}
}
class man
{
	Date date;

	public man(Date date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return "man [date=" + date + "]";
	}
	
}
