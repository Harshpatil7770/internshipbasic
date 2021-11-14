class Get extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
public static void main(String args[])
{
Get a1=new Get();
a1.setName("Current Thread 1");
a1.start();
Get a2=new Get();
a2.setName("Current Thread 2");
a2.start();
}
}