
public class HelloThread extends Thread{
	
	public void run()
	{
		System.out.println("Thread is runnung");
	}
	
	
	public static void main(String[] args)
	{
		(new HelloThread()).start();
	}

}
