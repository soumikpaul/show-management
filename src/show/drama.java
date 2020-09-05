package show;
import java.util.*;

public class drama extends register{
	String city;
	int price;
	int ticketsAvail;
	private String dramaName;
	String DT;
	drama(String city,int price,int ticketsAvail,String showTime)
	{
		this.city=city;
		this.price=price;
		this.ticketsAvail=ticketsAvail;
		this.DT=showTime;
	}
	Scanner sc=new Scanner(System.in);
	void setDramaNameDetails(){
		while(true) {
			System.out.println("Give the drama name :");
			dramaName=sc.nextLine();
			if(!isInteger(dramaName))
				break;

		}
	}
	String getDramaNameDetails() 
	{
		return dramaName;
	}
}
