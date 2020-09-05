package show;
import java.util.*;

public class event {
	public static void main(String[] args)
	{
		int x=0;

		while(true) {
			try {
				System.out.println("Press 1 to resgister an event\n 2 to list events by city\n 3 to list tickets by event name\n 5 to quit.");
				Scanner sc=new Scanner(System.in);

				x=sc.nextInt();
				if(x==1)
				{
					register r=new register();
					r.details();
				}
				if(x==2)
				{
					display d=new display();
					d.cityName();
					System.out.println("Total number of shows: "+d.totalShow());
				}
				if(x==5)
				{
					break;
				}
				if(x==3)
				{
					display e=new display();
					System.out.println("Total number of shows: "+e.totalShow());
					e.dispShow();   
				}
			}
			catch(Exception e)
			{
				System.out.println("Please give integer inputs.");
			}
		}
		//sc.close();
	}
}
