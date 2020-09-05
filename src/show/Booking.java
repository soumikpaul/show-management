package show;
import java.util.*;
public class Booking {
	String showtype,city;
	private int price;
	private int avail;
	Booking(String showType,String city,int price,int avail)
	{
		this.showtype=showType;
		this.city=city;
		this.price=price;
		this.avail=avail;
	}
	//int a=avail;
	//static boolean seats[]=new boolean[a];
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give Name");
		String name=sc.nextLine();
		System.out.println("age, phone no");
		int age=sc.nextInt();
		long phone=sc.nextLong();
		System.out.println("How many tickets do you want? ");
		int no=sc.nextInt();
		if(no>avail)
			System.out.println("Only "+avail+" tickets available you can't buy more than that");
		else
		{
			avail=avail-no;
			System.out.println("You need to pay "+no*price);
			System.out.println(name+" has purchased "+no+" tickets");
		}
		sc.close();


		//		if(this.showtype.equals("movie"))
		//		{
		//			System.out.println("Input seat numbers you want 10*10 seats");
		//			int start=sc.nextInt();
		//int end=sc.nextInt();
		//			for(int i=start+1;i<=start+no;i++)
		//			{
		//				if(seats[i]==true)
		//					System.out.println("Seat no "+(i+1)+" already occupied.");
		//				seats[i]=true;
		//			}
	}
	//	}
	int getAvail()
	{
		return this.avail;
	}
}
