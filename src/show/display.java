package show;
import java.util.*;
public class display {
	static ArrayList<drama> p=new ArrayList<drama>();
	static ArrayList<movie> mv=new ArrayList<movie>();
	static ArrayList<music> ms=new ArrayList<music>();
	Scanner sc=new Scanner(System.in);
	display()
	{}
	display(drama r)
	{
		add(r);
		System.out.println("Event has been added"+p.size());	
	}
	display(music m)
	{
		add(m);
		System.out.println("Event has been added");
	}
	display(movie r)
	{
		add(r);
		System.out.println("Event has been added");
	}
	static void add(drama r)
	{
		p.add(r);
	}
	static void add(movie r)
	{
		mv.add(r);
	}
	static void add(music r)
	{
		ms.add(r);
	}
	void cityName()
	{
		System.out.println("Which city you want to search?");
		String city=sc.next();
		System.out.println("Displaying by city name");
		for(int i=0;i<p.size();i++)
		{
			if(p.get(i).city.equals(city))
			{
				System.out.println("City : "+p.get(i).city+"\n Type drama "+"\nDrama Name : "+p.get(i).getDramaNameDetails()+"\n No of Tickets avail : "+p.get(i).ticketsAvail+"\n Date and Time of show : "+p.get(i).DT);
			}
		}
		for(int i=0;i<ms.size();i++)
		{
			if(ms.get(i).city.equals(city))
				System.out.println("City : "+ms.get(i).city+"\n Type music "+"\n Artist Name: "+ms.get(i).getArtistDetails()+"\n No of Tickets avail : "+ms.get(i).ticketsAvail+"\n Date and Time of show : "+ms.get(i).DT);
		}
		for(int i=0;i<mv.size();i++)
		{
			if(mv.get(i).city.equals(city))
				System.out.println("City : "+mv.get(i).city+"\n Type movie "+"\n Movie Name : "+mv.get(i).getMovieNameDetails()+"\n No of Tickets avail : "+mv.get(i).ticketsAvail+"\n Date and Time of show : "+mv.get(i).DT);
		}
		bookShow();
		totalShow();
	}
	void dispShow()
	{
		System.out.println("Which show you want to search?");
		String showType=sc.next();
		System.out.println("Displaying by show Type");
		if(showType.toLowerCase().equals("drama"))
		{
			for(int i=0;i<p.size();i++)
			{
				System.out.println("City : "+p.get(i).city+"\ndrama "+"\nDrama Name: "+p.get(i).getDramaNameDetails()+"\nAvailable Tickets: "+p.get(i).ticketsAvail+"\nShowTime : "+p.get(i).DT);
			}
		}
		if(showType.toLowerCase().equals("music"))
		{
			for(int i=0;i<ms.size();i++)
			{
				System.out.println("City : "+ms.get(i).city+"\n Type music"+"\nArtist Name: "+ms.get(i).getArtistDetails()+"\nTickets Available: "+ms.get(i).ticketsAvail+"\nShowTime: "+ms.get(i).DT);
			}
		}
		if(showType.toLowerCase().equals("movie"))
		{
			for(int i=0;i<mv.size();i++)
			{
				System.out.println(mv.get(i).city+"movie"+mv.get(i).getMovieNameDetails()+mv.get(i).ticketsAvail+mv.get(i).DT);
			}
		}
		bookShow();
	}
	int totalShow()
	{
		int total=p.size()+ms.size()+mv.size();
		return total;
	}
	void bookShow()
	{
		try {
			System.out.println("Press 1 to book: ");
			int inp=sc.nextInt();
			int priceBook=0,ticketA=0;
			if(inp==1)
			{
				int i=0;
				System.out.println("What do you want to book");
				String type=sc.next();
				System.out.println("Which city you want to book");
				String c=sc.next();
				if(type.equals("drama"))
				{
					for(i=0;i<p.size();i++)
					{
						System.out.println("Which drama do you want to book");
						String dramaName=sc.next();
						if(p.get(i).city.equals(c)&&p.get(i).getDramaNameDetails().equals(dramaName))
						{
							priceBook=p.get(i).price;
							ticketA=p.get(i).ticketsAvail;
						}
					}
				}
				else if(type.equals("music"))
				{
					for(i=0;i<ms.size();i++)
					{
						System.out.println("Which artist do you want to book");
						String artistName=sc.next();
						if(ms.get(i).city.equals(c)&&ms.get(i).getArtistDetails().equals(artistName))
						{
							priceBook=ms.get(i).price;
							ticketA=ms.get(i).ticketsAvail;
						}
					}
				}
				else if(type.equals("movie"))
				{
					for(i=0;i<mv.size();i++)
					{
						System.out.println("Which movie do you want to book");
						String movieName=sc.next();
						if(mv.get(i).city.equals(c)&&mv.get(i).getMovieNameDetails().equals(movieName))
						{
							priceBook=mv.get(i).price;
							ticketA=mv.get(i).ticketsAvail;
						}
					}
				}
				else {
					System.out.println("No such events exist");
				}
				if(ticketA!=0)
				{
					System.out.println("Available ticket"+ticketA);
					Booking book=new Booking(type,c,priceBook,ticketA);
					book.input();
					int newAvail=book.getAvail();
					System.out.println("new avail tickets: "+newAvail);
					if(type.equals("drama"))
						p.get(i-1).ticketsAvail=newAvail;
					if(type.equals("music"))
						ms.get(i-1).ticketsAvail=newAvail;
					if(type.equals("movie"))
						mv.get(i-1).ticketsAvail=newAvail;
				}

			}
		}
		catch(Exception e)
		{
			System.out.println("Please give the correct inputs.");
		}
		sc.close();
	}
}
