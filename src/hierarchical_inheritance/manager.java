package hierarchical_inheritance;

public class manager extends employee
{
	double salary=30000;
	double insentive=4000;
// method overriding
  void  work()
  {
	  double total=salary+insentive;
	  System.out.println("total salary of manager : "+total);
  }
}
