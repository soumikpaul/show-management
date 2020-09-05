package show;
import java.util.*;
public class music extends register{
	String city;
	int price;
	int ticketsAvail;
	private String songName;
	private String artist;
	String DT;
	music(String city,int price,int ticketsAvail,String showTime)
	{
		this.city=city;
		this.price=price;
		this.ticketsAvail=ticketsAvail;
		this.DT=showTime;
	}

	Scanner sc=new Scanner(System.in);
	void setMusicNameDetails(){
		while(true) {


			System.out.println("Give the song name :");
			songName=sc.next();
			System.out.println("Give artist name");
			artist=sc.next();
			if(!isInteger(songName)&&!isInteger(artist))
				break;
		}
	}
	String getSongNameDetails() 
	{
		return songName;
	}
	String getArtistDetails() 
	{
		return artist;
	}
}



