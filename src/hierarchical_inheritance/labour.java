package hierarchical_inheritance;

public class labour extends employee
{
	double salary=25000;
	double overtime=2000;
 void work()
 {
	 double total=salary+overtime;
	 System.out.println("total salary of Labour : "+total);
	 
 }
}
