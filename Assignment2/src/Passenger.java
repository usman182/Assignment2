import java.util.Scanner;

public class Passenger {
	
	private String name;
	private String gender;
	private String age;
	private String address;
	private String origin;
	private String destination;
	private String passportNumber;
	private String CNICNumber;
	private String planeType;
	
	private Ticket ticket;	// composition
	
	public Passenger()
	{
		ticket = new Ticket();
	}
	
	public Ticket getTicket()
	{
		return ticket;
	}
	
	// Setter Functions
	// Function to set the name of the passenger
	public void setName()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name: ");
		this.name = scanner.nextLine();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	// Function to set the gender of the passenger
	public void setGender()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter gender: ");
		this.gender = scanner.nextLine();
	}
	
	public String getGender()
	{
		return this.gender;
	}
		
	
	// Function to set the age of the passenger
	public void setAge()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age: ");
		this.age = scanner.next();
	}
		
	public String getAge()
	{
		return this.age;
	}
	
	// Function to set the address of the passenger
	public void setAddress()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter address: ");
		this.address = scanner.nextLine();
	}
	
	public String getAddress()
	{
		return this.address;
	}
				
	// Function to set the origin
	public void setOrigin()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter origin: ");
		this.origin = scanner.nextLine();
	}
	
	public String getOrigin()
	{
		return this.origin;
	}
	
	// Function to set the destination
	public void setDestination()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter destination: ");
		this.destination = scanner.nextLine();
	}
	
	public String getDestination()
	{
		return this.destination;
	}
	
	// Function to set the passengers
	/*public void setPassengers()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of passengers: ");
		passengers = scanner.nextInt();
	}*/
	
	// Function to set the passport number of the passenger
	public void setPassportNumber()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter passport number (8 digit): ");
		this.passportNumber = scanner.next();
	}
	
	public String getPassportNumber()
	{
		return this.passportNumber;
	}
	
	// Function to set the CNIC number of the passenger
	public void setCNICNumber()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter CNIC number: ");
		this.CNICNumber = scanner.next();
	}
			
	public String getCNICNumber()
	{
		return this.CNICNumber;
	}
	
	// Function to set the plane type of the passenger
	public void setPlaneType()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter plane type (Business/First/Economy): ");
		this.planeType = scanner.nextLine();
	}
	
	public String getPlaneType()
	{
		return this.planeType;
	}
						
	
	// Function to display passenger information
	public String toString()
	{
		return "Name = " + name + "\nGender = " + gender + "\nAge = " + age + "\nAddress = " + address + "\nOrigin = " + origin + "\nDestination = " + destination + "\nPassport Number = " + passportNumber + "\nCNIC Number = " + CNICNumber + "\nPlane Type = " + planeType;
		
	}

}
