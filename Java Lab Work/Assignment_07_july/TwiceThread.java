public class TwiceThread extends Thread
{
	@Override
	public void run(){
		System.out.println("Thread started running...");
	}
	public static void main(String[] args)
	{	
			TwiceThread thread1 = new TwiceThread();
			thread1.start();
			thread1.start();
	}
}
