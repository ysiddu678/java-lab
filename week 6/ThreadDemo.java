class MyThread extends Thread
{
      public void run()
         {
			  //Thread.currentThread().setName("CSEA");
			 // Thread.currentThread().setPriority(5);
			  System.out.println("Priority of Child Thread is: " + Thread.currentThread().getPriority());
			  System.out.println("Name of Thread is: " + Thread.currentThread().getName());
              for(int i=1;i<=5;i++)
                {
                      System.out.println("Child Thread");
                }

                 
         }

}
class ThreadDemo
{
	public static void main(String[] args)
	{
		//Thread.currentThread().setName("VJIT");
		//Thread.currentThread().setPriority(8);
		System.out.println("Priority of Main Thread is: " + Thread.currentThread().getPriority());
		System.out.println("Name of Thread is :" + Thread.currentThread().getName());
		MyThread t=new MyThread();
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}