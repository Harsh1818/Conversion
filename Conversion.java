import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) 
	{
		try (Scanner s=new Scanner(System.in)){
			int x;
			x=s.nextInt();
			int year,days;
			int minutesInYear=60*24*365;
			year=x/minutesInYear;
			System.out.print(year+" years ");
			x=x-(year*minutesInYear);
			int minutesInDay=60*24;
			days=x/minutesInDay;
			System.out.print("and "+days+" days.");	
		}
		
	}
}
