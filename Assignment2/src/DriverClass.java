import java.util.Scanner;

public class DriverClass {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int answer;
		Passenger passenger = new Passenger();	// created a Passenger class object
		Date date = new Date();	// created a Date class object
		do
		{
		// Getting customer details
		passenger.setName();
		passenger.setGender();
		passenger.setAge();
		passenger.setAddress();
		passenger.setOrigin();
		passenger.setDestination();
		passenger.setPassportNumber();
		passenger.setCNICNumber();
		passenger.setPlaneType();
		
		//date.setFlightDate("24-10-21", "25-10-21", "26-10-21", "27-10-21", "28-10-21");
		// Getting flight dates
		
		
		Flight flight = new Flight();
		Ticket ticket = new Ticket();
		flight.setPassenger(passenger);
		flight.setFlightDate("24-10-2021", "8:00 AM", "30,000/- PKR", "25-10-2021", "10:00 AM", "35,000/- PKR", "26-10-2021", "12:00 PM", "40,000/- PKR", "27-10-2021", "2:00 PM", "45,000/- PKR", "28-10-2021", "4:00 PM", "50,000/- PKR");
		System.out.println(flight);
		//System.out.println(date);
		
		
		System.out.println("\nTicket Number = " + passenger.getTicket().getTicketNumber());
		
		System.out.println("Do you want to book another seat? Press 1 for yes and 2 for no");
		answer = scanner.nextInt();
		
		
		
		} while (answer == 1);
		
		
	}
	
}	