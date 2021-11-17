
public class TicketBooking {
	
	int tickets = 10;
	synchronized public void bookticket(int wantedtickets)
	{
		if (wantedtickets <= tickets)
		{
			System.out.println(wantedtickets + " tickets booked successfully");
			tickets = tickets - wantedtickets;
			System.out.println("Total tickets left : " + tickets);
		}
		
		else
		{
			System.out.println("No tickets to book");
			System.out.println("Total tickets left : " + tickets);
		}
	}

}
