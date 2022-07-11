package lamda;

import java.util.ArrayList;
import java.util.List;

public class lamda_q2 
{
	public static void main(String args[])
	{
	   List<order> l=new ArrayList<>();
	   
       l.add(new order("completed",10000.0));
	   l.add(new order("accepted",10100.0));
	   l.add(new order("notaccepted",100.0));
	   }
}
class order{
	String status;
    double price;
	public order(String status, double price) {
		super();
		this.status = status;
		this.price = price;
	}
	@Override
	public String toString() {
		return "order [status=" + status + ", price=" + price + "]";
	}
    
 
}

