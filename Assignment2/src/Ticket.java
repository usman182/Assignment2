
public class Ticket {
	
	static private int ticketNumber = 0;
	
	
	
	public int getTicketNumber()
	{
		this.ticketNumber++;
		return this.ticketNumber;
	}

}
