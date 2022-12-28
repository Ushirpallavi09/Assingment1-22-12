package Assignment29;

public class ThreadEx {

	public static void main(String[] args)
	{
			MyThread t=new MyThread();
			t.start();
			for(int i=20;i<=25;i++)
			{
				System.out.println("The number is odd");
			}
		}
	}
	class MyThread extends Thread
	{
		public void run()
		{
			for(int i=20;i<=25;i++)
			{
				System.out.println("The number is even");
			}


		}



	}

