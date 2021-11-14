class Min extends Thread
{
public void run() // run() method provided by runnable interface.
{
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
}
public static void main(String args[])
{
Min a1=new Min();
a1.setPriority(MIN_PRIORITY);
a1.start();
}
}