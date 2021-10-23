import java.util.Scanner;

public class DriverClass {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Passenger passenger = new Passenger();	// created a Passenger class object
		
		bool flag = true;
		while (flag)
		{
		// Getting customer details
		passenger.setName();
		passenger.setGender();
		passenger.setAge();
		passenger.setAddress();
		passenger.setOrigin();
		passenger.setDestination();
		//passenger.setPassengers();
		passenger.setPassportNumber();
		passenger.setCNICNumber();
		passenger.setPlaneType();
		
		Flight flight = new Flight();
		flight.setPassenger(passenger);
		flight.setFlightDate("24-10-2021", "25-10-2021", "26-10-2021", "27-10-2021", "28-10-2021");
		System.out.println(flight);
		
		System.out.println("How many passengers are there with you");
		int numOfPassengers = scanner.nextInt();
		}
		
		
		
		
		
		
		
		
		//passenger.displayPassenger();	// This function will display all the customer information
		
	}
	
}	