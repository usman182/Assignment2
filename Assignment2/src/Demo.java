
public class Demo implements Runnable{

		public void run()
		{
			System.out.println("Thread is running");
		}
		
		public static void main(String[] args)
		{
			Demo m1 = new Demo();
			Thread t1 = new Thread(m1);	// using the constructor thread (Runnable r)
			t1.start();
		}
}
