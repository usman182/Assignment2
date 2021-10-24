import java.util.Scanner;

public class Date {

	private String[] flightDates = new String[50];
	private String storeDate;
	
	
	public void setFlightDate(String date1, String date2, String date3, String date4, String date5)
	{
		Scanner scanner = new Scanner(System.in);
		int key;
		do
		{
			System.out.println("Here is the list of Flight Dates. Please select the required key for your preferred date: ");
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("1 =>  " + date1);
			System.out.println("2 =>  " + date2);
			System.out.println("3 =>  " + date3);
			System.out.println("4 =>  " + date4);
			System.out.println("5 =>  " + date5);
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("Enter the key for flight date: ");
			key = scanner.nextInt();
		} while (key > 5);
		
		if (key == 1)
		{
			this.flightDates[0] = date1;
			System.out.println("You selected " + flightDates[0]);
			storeDate = date1;
			
		}
		
		else if (key == 2)
		{
			this.flightDates[1] = date2;
			System.out.println("You selected " + flightDates[1]);
			storeDate = date2;
		}
		
		else if (key == 3)
		{
			this.flightDates[2] = date3;
			System.out.println("You selected " + flightDates[2]);
			storeDate = date3;
		}
		
		else if (key == 4)
		{
			this.flightDates[3] = date4;
			System.out.println("You selected " + flightDates[3]);
			storeDate = date4;
		}
		
		else
		{
			this.flightDates[4] = date5;
			System.out.println("You selected " + flightDates[4]);
			storeDate = date5;
	}
		
	}
	
	public String getDate()
	{
		return this.storeDate;
	}
	
	public String toString()
	{
		System.out.println("Your details are mentioned below: ");
		return "\nFlight Date Selected = " + storeDate;
	}
	
}
