
public class SleepDemo implements Runnable{
	
	Thread t;
	public void run()
	{
		for (int i=0; i<4; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		Thread t = new Thread(new SleepDemo());
		
		// call run() function
		t.start();
		
		Thread t2 = new Thread(new SleepDemo());
		
		// call run() function
		t2.start();
		
		Thread t3 = new Thread(new SleepDemo());
		
		// call run() function
		t3.start();
	}

}
