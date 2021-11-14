public class MakeDaemonThread extends Thread
{
public void run()
{
System.out.print("Daemon Thread is Executing-");
System.out.println(Thread.currentThread().isDaemon());
if(Thread.currentThread().isDaemon())
{
System.out.println("Daemon Thread is Executing");
}
else
{
System.out.println("Current Thread is Executing");
}
}
public static void main(String args[])
{
MakeDaemonThread a1=new MakeDaemonThread();
a1.start();
try
{
	a1.join();
}
catch(InterruptedException e)
{
	System.out.println(e.getMessage());
}
MakeDaemonThread a2=new MakeDaemonThread();
a2.setDaemon(true);
a2.start();
}
}
