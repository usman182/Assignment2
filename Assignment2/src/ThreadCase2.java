
public class ThreadCase2 extends Thread {
	
	public void run()
	{
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args)
	{
		ThreadCase2 t1 = new ThreadCase2();
		t1.start();// thread 1
		
		ThreadCase2 t2 = new ThreadCase2();
		t2.start();// thread 2
		
		
		
	}

}
