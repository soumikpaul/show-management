package show;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class register{
	boolean isInteger(String city)
	{
		for(int i=0;i<city.length();i++)
		{
			try {
				Integer.parseInt(String.valueOf(city.charAt(i)));
				//city.charAt(i).parseInt();
				return true;
			}
			catch(Exception e)
			{
				continue;
			}
		}
		return false;
	}
	void details() {
		String city="",showTime="";
		int price=0;
		int ticketsTotal;
		int ticketsAvail=0;
		int hours,mins,day,month,year;
		int input=0;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Welcome to registration");
			System.out.println("Give showType options Drama, Music, Art, Food, Movie 1 for drama, 2 for music, 3 for movie");
			input=sc.nextInt();
			while(true) {
				System.out.println("Enter the city:");
				city=sc.next();
				if(!isInteger(city))
					break;
			}
			System.out.println("Enter Price and Total tickets:");
			price=sc.nextInt();
			ticketsTotal=sc.nextInt();
			ticketsAvail=ticketsTotal;
			System.out.println("Enter mins,hours,day,month,year of the event");
			mins=sc.nextInt();
			hours=sc.nextInt();
			day=sc.nextInt();
			month=sc.nextInt();
			year=sc.nextInt();
			LocalDateTime showTimeLocal=LocalDateTime.of(year, month, day, hours, mins);
			DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm a");
			showTime=showTimeLocal.format(format1);
			System.out.println(showTime);

			if(input==1)
			{	    	  
				System.out.println("In drama");
				drama dr=new drama(city,price,ticketsAvail,showTime);
				dr.setDramaNameDetails();
				display d=new display(dr);
				//new display(dr);
			}
			if(input==2)
			{	    	  
				System.out.println("In music");
				music ms=new music(city,price,ticketsAvail,showTime);
				ms.setMusicNameDetails();
				display d=new display(ms);
			}
			if(input==3)
			{	    	  
				System.out.println("In movie");
				movie mv=new movie(city,price,ticketsAvail,showTime);
				mv.setMovieNameDetails();
				display d=new display(mv);
			}
		}
		catch(Exception e)
		{
			System.out.println("Please enter the correct inputs");
		}
		sc.close();

	}
}
