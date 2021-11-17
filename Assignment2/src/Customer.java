
public class Customer extends Thread{
	
	static TicketBooking b;
	String name;
	int ticket;
	
	
	public void run()
	{
		b.bookticket(ticket);
	}
	
	public static void main(String[] args)
	{
		b = new TicketBooking();
		Customer cus1 = new Customer();		// thread 1
		cus1.ticket = 6;
		cus1.start();
		
		Customer cus2 = new Customer();		// thread 2
		cus2.ticket = 7;
		cus2.start();
	}

}
