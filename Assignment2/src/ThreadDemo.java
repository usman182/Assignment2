
public class ThreadDemo extends Thread{
	
	public void run()
	{
		System.out.println("Thread is runnung");
	}
	
	
	public static void main(String[] args)
	{
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
	}

}
