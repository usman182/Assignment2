import java.util.Scanner;

public class Flight {
	
	private String[] flightDates = new String[50];
	private String[] flightTimes = new String[50];
	private String[] flightFares = new String[50];
	static private int initialFlightSeat1 = 0;
	static private int initialFlightSeat2 = 0;
	static private int initialFlightSeat3 = 0;
	static private int initialFlightSeat4 = 0;
	static private int initialFlightSeat5 = 0;
	private int totalFlightSeats = 50;
	private Passenger passenger;
	private Date date;
	private Time time;
	
	private String storeDate;
	private String storeTime;
	private String storeAmount;
	private int storeFlightSeat;
	
	public void setPassenger(Passenger passenger)
	{
		this.passenger = passenger;
	}
	
	public Passenger getPassenger()
	{
		return this.passenger;
	}
	
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	public Date getDate()
	{
		return this.date;
	}
	
	
	
	
	// Function to set Flight dates
	public void setFlightDate(String date1, String time1, String amount1, String date2, String time2, String amount2, String date3, String time3, String amount3, String date4, String time4, String amount4, String date5, String time5, String amount5)
	{
			Scanner scanner = new Scanner(System.in);
			int key;
			do
			{
				System.out.println("Here is the list of Flight Dates along with the time and price package. Please select the required key for your preferred date: ");
				System.out.println("-------------------------------------------------------------------------------------------");
				System.out.println("1 =>  " + date1 + " at " + time1 + " with fare amount of " + amount1);
				System.out.println("2 =>  " + date2 + " at " + time2 + " with fare amount of " + amount2);
				System.out.println("3 =>  " + date3 + " at " + time3 + " with fare amount of " + amount3);
				System.out.println("4 =>  " + date4 + " at " + time4 + " with fare amount of " + amount4);
				System.out.println("5 =>  " + date5 + " at " + time5 + " with fare amount of " + amount5);
				System.out.println("-------------------------------------------------------------------------------------------");
				System.out.println("Enter the key for flight date: ");
				key = scanner.nextInt();
			} while (key > 5);
			
			if (key == 1)
			{
				this.flightDates[0] = date1;
				this.flightTimes[0] = time1;
				this.flightFares[0] = amount1;
				System.out.println("You selected " + flightDates[0] + " at time of " + flightTimes[0] + " with fare amount " + flightFares[0]);
				storeDate = date1;
				storeTime = time1;
				storeAmount = amount1;
				
				if (initialFlightSeat1 < totalFlightSeats)
				{
					initialFlightSeat1++;
					storeFlightSeat = initialFlightSeat1;
				}
				else
				{
					System.out.println("The flight seats are full! Please select another flight package");
				}
				
				System.out.println("Do you want to cancel the seat? Press 1 for yes and 2 for no");
				int result = scanner.nextInt();
				if (result == 1)
				{
					initialFlightSeat1--;
					storeFlightSeat = initialFlightSeat1;
				}
			}
			
			else if (key == 2)
			{
				this.flightDates[1] = date2;
				this.flightTimes[1] = time2;
				this.flightFares[1] = amount2;
				System.out.println("You selected " + flightDates[1] + " at time of " + flightTimes[1]  + " with fare amount " + flightFares[1]);
				storeDate = date2;
				storeTime = time2;
				storeAmount = amount2;
				
				if (initialFlightSeat2 < totalFlightSeats)
				{
					initialFlightSeat2++;
					storeFlightSeat = initialFlightSeat2;
				}
				else
				{
					System.out.println("The flight seats are full! Please select another flight package");
				}
				System.out.println("Do you want to cancel the seat? Press 1 for yes and 2 for no");
				int result = scanner.nextInt();
				if (result == 1)
				{
					initialFlightSeat2--;
					storeFlightSeat = initialFlightSeat2;
				}
			}
			
			else if (key == 3)
			{
				this.flightDates[2] = date3;
				this.flightTimes[2] = time3;
				this.flightFares[2] = amount3;
				System.out.println("You selected " + flightDates[2] + " at time of " + flightTimes[2]   + " with fare amount " + flightFares[2]);
				storeDate = date3;
				storeTime = time3;
				storeAmount = amount3;
				
				if (initialFlightSeat3 < totalFlightSeats)
				{
					initialFlightSeat3++;
					storeFlightSeat = initialFlightSeat3;
				}
				else
				{
					System.out.println("The flight seats are full! Please select another flight package");
				}
				System.out.println("Do you want to cancel the seat? Press 1 for yes and 2 for no");
				int result = scanner.nextInt();
				if (result == 1)
				{
					initialFlightSeat3--;
					storeFlightSeat = initialFlightSeat3;
				}
			}
			
			else if (key == 4)
			{
				this.flightDates[3] = date4;
				this.flightTimes[3] = time4;
				this.flightFares[3] = amount4;
				System.out.println("You selected " + flightDates[3] + " at time of " + flightTimes[3]    + " with fare amount " + flightFares[3]);
				storeDate = date4;
				storeTime = time4;
				storeAmount = amount4;
				
				if (initialFlightSeat4 < totalFlightSeats)
				{
					initialFlightSeat4++;
					storeFlightSeat = initialFlightSeat4;
				}
				else
				{
					System.out.println("The flight seats are full! Please select another flight package");
				}
				System.out.println("Do you want to cancel the seat? Press 1 for yes and 2 for no");
				int result = scanner.nextInt();
				if (result == 1)
				{
					initialFlightSeat4--;
					storeFlightSeat = initialFlightSeat4;
				}
			}
			
			else
			{
				this.flightDates[4] = date5;
				this.flightTimes[4] = time5;
				this.flightFares[4] = amount5;
				System.out.println("You selected " + flightDates[4] + " at time of " + flightTimes[4]     + " with fare amount " + flightFares[4]);
				storeDate = date5;
				storeTime = time5;
				storeAmount = amount5;
				
				if (initialFlightSeat5 < totalFlightSeats)
				{
					initialFlightSeat5++;
					storeFlightSeat = initialFlightSeat5;
				}
				else
				{
					System.out.println("The flight seats are full! Please select another flight package");
				}
				System.out.println("Do you want to cancel the seat? Press 1 for yes and 2 for no");
				int result = scanner.nextInt();
				if (result == 1)
				{
					initialFlightSeat5--;
					storeFlightSeat = initialFlightSeat5;
				}
			}
			
			
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		}
	
	
	public String toString()
	{
		System.out.println("Your details are mentioned below: ");
		return passenger + "\nFlight Date Selected = " + storeDate + "\nFlight Time Selected = " + storeTime + "\nFare Amount = " + storeAmount + "\nFlight Seat Number = " + storeFlightSeat;
	}
	

}
