import java.util.Scanner;

public class Flight {
	
	private String[] flightDates = new String[50];
	private Passenger passenger;
	private String storeDate;
	
	
	public void setPassenger(Passenger passenger)
	{
		this.passenger = passenger;
	}
	
	public Passenger getPassenger()
	{
		return this.passenger;
	}
	
	
	// Function to set Flight dates
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
			
	
			System.out.println("------------------------------------------------------------------------------------------------------------------");
	/*flightDates[0] = "23-10-2021 => Islamabad to Lahore => Dept Time: 8:00 AM => Arrival Time: 8:30 AM => Seat Type:First => Plane: PK211 => Fare Amount: 30,000 PKR/- => Total Seats: 50";
	flightDates[1] = "23-10-2021 => Islamabad to Lahore => Dept Time: 10:00 AM => Arrival Time: 10:30 AM => Seat Type:Economy => Plane: PK212 => Fare Amount: 40,000 PKR/- => Total Seats: 60";
	flightDates[2] = "23-10-2021 => Islamabad to Lahore => Dept Time: 12:00 PM => Arrival Time: 12:30 PM => Seat Type:Business => Plane: PK213 => Fare Amount: 50,000 PKR/- => Total Seats: 70";
			
			
	flightDates[3] = "23-10-2021 => Islamabad to Karachi => Dept Time: 7:00 AM => Arrival Time: 11:00 AM => Seat Type:First => Plane: PK214 => Fare Amount: 100,000 PKR/- => Total Seats: 50";
	flightDates[4] = "23-10-2021 => Islamabad to Karachi => Dept Time: 1:00 PM => Arrival Time: 4:00 PM => Seat Type:Economy => Plane: PK215 => Fare Amount: 110,000 PKR/- => Total Seats: 60";
	flightDates[5] = "23-10-2021 => Islamabad to Karachi => Dept Time: 6:00 PM => Arrival Time: 9:00 PM => Seat Type:Business => Plane: PK216 => Fare Amount: 120,000 PKR/- => Total Seats: 70";
		
		
	flightDates[6] = "23-10-2021 => Islamabad to Faisalabad => Dept Time: 5:00 AM => Arrival Time: 6:00 AM => Seat Type:First => Plane: PK217 => Fare Amount: 40,000 PKR/- => Total Seats: 50";
	flightDates[7] = "23-10-2021 => Islamabad to Faisalabad => Dept Time: 6:00 AM => Arrival Time: 7:00 AM => Seat Type:Economy => Plane: PK218 => Fare Amount: 50,000 PKR/- => Total Seats: 60";
	flightDates[8] = "23-10-2021 => Islamabad to Faisalabad => Dept Time: 7:00 AM => Arrival Time: 8:00 AM => Seat Type:Business => Plane: PK219 => Fare Amount: 60,000 PKR/- => Total Seats: 70";	
		
	
	flightDates[9] = "24-10-2021 => Islamabad to Multan => Dept Time: 8:00 AM => Arrival Time: 8:30 AM => Seat Type:First => Plane: PK211 => Fare Amount: 30,000 PKR/- => Total Seats: 50";
	flightDates[10] = "24-10-2021 => Islamabad to Lahore => Dept Time: 10:00 AM => Arrival Time: 10:30 AM => Seat Type:Economy => Plane: PK212 => Fare Amount: 40,000 PKR/- => Total Seats: 60";
	flightDates[11] = "24-10-2021 => Islamabad to Lahore => Dept Time: 12:00 PM => Arrival Time: 12:30 PM => Seat Type:Business => Plane: PK213 => Fare Amount: 50,000 PKR/- => Total Seats: 70";
		*/	
		
		}
		
		/*public void setPassenger(Passenger p) {			
			passengers.add(p)
		}*/
	
	
	public String toString()
	{
		System.out.println("Your details are mentioned below: ");
		return passenger + "\nFlight Date Selected = " + storeDate + "";
	}
	

}
