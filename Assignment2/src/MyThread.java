
	public class MyThread extends Thread{
		
		public void run()
		{
			System.out.println("Thread is runnung");
		}
		
		
		public static void main(String[] args)
		{
			MyThread t1 = new MyThread();
			t1.start();
			
			// setting the prority
			t1.setPriority(2);
			
			// getting prority
			int p = t1.getPriority();
			
			System.out.println("Thread prority is : " + p);
		}

	}

