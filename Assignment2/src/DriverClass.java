import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DriverClass {
	
	public static void main(String[] args) throws IOException
	{
		FileWriter myWriter = new FileWriter("PassengerDataInFile.txt");
		myWriter.write("Name\t\tGender\tAge\tAddress\t\t\t\t\tOrigin\t\tDestination\tPassport Number\t\tCNIC Number\t\tPlane Type\tTicket Number\tFlight Time\tFlight Day\tSeat Number");
		
		Scanner scanner = new Scanner(System.in);
		int answer;
		Passenger passenger = new Passenger();	// created a Passenger class object
		//Date date = new Date();	// created a Date class object
		
		
		do
		{
		// Getting customer details
		passenger.setName();
		myWriter.write("\n" + passenger.getName());
		passenger.setGender();
		myWriter.write("\t" + passenger.getGender());
		passenger.setAge();
		myWriter.write("\t" + passenger.getAge());
		passenger.setAddress();
		myWriter.write("\t" + passenger.getAddress());
		passenger.setOrigin();
		myWriter.write("\t" + passenger.getOrigin());
		passenger.setDestination();
		myWriter.write("\t" + passenger.getDestination());
		passenger.setPassportNumber();
		myWriter.write("\t\t" + passenger.getPassportNumber());
		passenger.setCNICNumber();
		myWriter.write("\t\t" + passenger.getCNICNumber());
		passenger.setPlaneType();
		myWriter.write("\t" + passenger.getPlaneType());
		//myWriter.close();
		
		Flight flight = new Flight();
		Ticket ticket = new Ticket();
		flight.setPassenger(passenger);
		flight.setFlightDate("24-10-2021", "8:00 AM", "30,000/- PKR", "25-10-2021", "10:00 AM", "35,000/- PKR", "26-10-2021", "12:00 PM", "40,000/- PKR", "27-10-2021", "2:00 PM", "45,000/- PKR", "28-10-2021", "4:00 PM", "50,000/- PKR");
		System.out.println(flight);
		
		int res = passenger.getTicket().getTicketNumber();
		System.out.println("\nTicket Number = " + res);
		myWriter.write("\t\t" + res);
		
		
		System.out.println("Do you want to book another seat? Press 1 for yes and 2 for no");
		answer = scanner.nextInt();
		
			myWriter.write("\t\t" + flight.getFlightDate());
			myWriter.write("\t" + flight.getFlightTime());
			myWriter.write("\t" + flight.getFlightSeat());
		
		} while (answer == 1);
		myWriter.close();	
	}
	
	
}	