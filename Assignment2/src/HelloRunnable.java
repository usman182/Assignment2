
public class HelloRunnable implements Runnable{

		public void run()
		{
			System.out.println("Thread is running");
		}
		
		public static void main(String[] args)
		{
			(new Thread(new HelloRunnable())).start();
		}
}
