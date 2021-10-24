import java.util.Scanner;

public class Time {
	
	private String[] flightTimes = new String[50];
	private String storeTime;
	
	public void setFlightTime(String time1, String time2, String time3, String time4, String time5)
	{
		Scanner scanner = new Scanner(System.in);
		int key;
		do
		{
			System.out.println("Here is the list of Flight Times. Please select the required key for your preferred time: ");
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("1 =>  " + time1);
			System.out.println("2 =>  " + time2);
			System.out.println("3 =>  " + time3);
			System.out.println("4 =>  " + time4);
			System.out.println("5 =>  " + time5);
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("Enter the key for flight time: ");
			key = scanner.nextInt();

}
