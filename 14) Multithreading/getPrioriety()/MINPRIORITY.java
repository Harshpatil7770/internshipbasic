class MINPRIORITY extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getPriority());
}
public static void main(String args[])
{
MINPRIORITY a1=new MINPRIORITY();
a1.setPriority(Thread.MIN_PRIORITY);
a1.start();
}
}