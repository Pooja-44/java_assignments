package java8_stream;

public class trasaction
{
	private trader trade;
private int year;
private	int value;
public trasaction(trader trade, int year, int value) {
	super();
	this.trade = trade;
	this.year = year;
	this.value = value;
}
public trader getTrade() {
	return trade;
}
public void setTrade(trader trade) {
	this.trade = trade;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
@Override
public String toString() {
	return "trasaction [trade=" + trade + ", year=" + year + ", value=" + value + "]";
}
	
	
	

}
