class GetPriority extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getPriority());
}
public static void main(String args[])
{
GetPriority a1=new GetPriority();
a1.setPriority(Thread.MAX_PRIORITY);
a1.start();
}
}