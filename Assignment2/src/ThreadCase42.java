
public class ThreadCase42 extends Thread {

	public void run()
	{
		System.out.println("Progress bar is executing");
	}
	
	
	
	public static void main(String[] args)
	{
		ThreadCase4 t1 = new ThreadCase4();
		t1.start();//thread 1
		
		ThreadCase42 t2 = new ThreadCase42();
		t2.start();//thread 2
	}
}
