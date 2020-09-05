package show;
import java.util.*;
public class movie extends register{
	String city;
	int price;
	int ticketsAvail;
	private String movieName;
	private String genre;
	String DT;
	
	movie(String city,int price,int ticketsAvail,String showTime)
	{
		this.city=city;
		this.price=price;
		this.ticketsAvail=ticketsAvail;
		this.DT=showTime;
	}
	
	Scanner sc=new Scanner(System.in);
	void setMovieNameDetails(){
		while(true) {
			System.out.println("Give the movie name :");
			movieName=sc.next();
			System.out.println("Give genre name");
			genre=sc.next();
			if(!isInteger(movieName)&&!isInteger(genre))
				break;
		}

	}
	
	String getMovieNameDetails() 
	{
		return movieName;
	}
	String getgenre() 
	{
		return genre;
	}
}
