package java8_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class main {
public static void main(String args[])
{
	fruits f=new fruits("apple",8,100,"red");
	fruits f1=new fruits("orage",7,60,"orange");
	fruits f2=new fruits("grapes",100,80,"green");
	fruits f3=new fruits("pomogranate",5,150,"red");
	
	
	
	
	
	List<fruits> fruits=new ArrayList<>();
	fruits.add(f);
	fruits.add(f1);
	fruits.add(f2);
    fruits.add(f3);
    
    news n=new news(1,"poo" , "sandy", "good");
	news n1=new news(2,"raman" , "news18", "better budget");
	news n2=new news(3,"rahul" , "kannadaprabha", "best  budget");
	news n3=new news(4,"ranjith" , "tv9", "average");
	news n4=new news(1,"ranath" , "suvarna", " very good budget");
	 
	List<news> news=new ArrayList<>();
	news.add(n);
	news.add(n1);
	news.add(n2);
	news.add(n3);
	news.add(n4);
	
	trader t=new trader("pooja", "chickmagalure");
	trader t1=new trader("spunith", "delhi");
	trader t2=new trader("susheela ", "chickgalure");
	trader t3=new trader("naga", "pune");
	trader t4=new trader("susheela ", "chickgalure");
	
	trasaction tr=new trasaction(t, 2012, 5000);
	trasaction tr2=new trasaction(t2, 2013, 10000);
	trasaction tr3=new trasaction(t3, 2014, 6000);
	trasaction tr4=new trasaction(t1, 2011, 4000);
	trasaction tr5=new trasaction(t4, 2011, 4000);
	
	List<trasaction> trade=new ArrayList<>();
	trade .add(tr);
	trade.add(tr2);
	trade.add(tr3);
	trade.add(tr4);
	trade.add(tr5);

//1 display the fruit names  of low calories fruits calories<100 sorted in descending order
    System.out.println("1.colories < 100 :");
   fruits.stream().filter(e->e.getCalories()<100)
   .sorted((a,b)->b.getCalories()-a.getCalories())
   .forEach(e->System.out.println(e.getName()));
   System.out.println();
//   2.color wise list
   System.out.println("color wise list :");
   fruits.stream().forEach(e->System.out.println(e.getName()+" :"+e.getColor()));
   System.out.println();
   
//3.disply only red color fruits , sorted as price in ascending order
   System.out.println("3.color wise : red");
   fruits.stream().filter(e->e.getColor()=="red")
   .sorted((a,b)->a.getPrice()-b.getPrice())
   .forEach(e->System.out.println(e.getName()+" :"+e.getColor()));
   System.out.println();
   
//  4. find out the news id which has received maximum comment
   
//   System.out.print("Maximum comment recieved news id");
//   news.stream()
//           .max(Comparator.comparing(news::getNewsId))
//           .get();
//   System.out.println();
   
// 5.how many times the budget word occurs
   
long bcount=   news.stream().filter(e->e.getComment().contains("budget")).count();
System.out.println( " 5.budget  word count :"+ bcount);
System.out.println();
   
//6.find out the user has posted maximum comments

//7.display commentbyuser wise number of comment


// 8.find the all trasaction in the year 2011  
System.out.println("trasaction in 2011:");
	List s=trade.stream().filter(e->e.getYear()==2011).collect(Collectors.toList());
	System.out.println(s.toString());
	System.out.println();
	
//9.unique city
//	System.out.println("9 .unique cities :");
//trade.stream().distinct().map(a->a.getTrade().getCity()).forEach(e->System.out.println(e));;
//System.out.println();

//	10.find all the trades pune
	
	System.out.println("pune traders:");
	trade.stream().filter(e->e.getTrade().city=="pune").forEach(System.out::println);
	System.out.println();
	
//	11.sorted by names
//	System.out.println("sorted by names :");
//
//	trade.stream()
//			.sorted((a,b)->a.getTrade().getName().equals(b.getTrade().getName())).map()
//	System.out.println(tname);
//	System.out.println();
	
//	12.
	
//	13.print all the traders living in mumbai
	System.out.println("13.delhi traders:");
	trade.stream().filter(e->e.getTrade().city=="delhi").forEach(e->System.out.println(e.getValue()));
	System.out.println();
	
//	14.max value
	System.out.println("14.Max value:");
trasaction tmax=	trade.stream().max(Comparator.comparing(trasaction::getValue)).get();
System.out.println(tmax.getValue());
System.out.println();


System.out.println("15. min value:");
trasaction tmin=	trade.stream().min(Comparator.comparing(trasaction::getValue)).get();
System.out.print(tmin.getValue());
System.out.println();

	
}
}
