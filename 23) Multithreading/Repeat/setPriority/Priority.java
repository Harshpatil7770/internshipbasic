class Priority extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getPriority());
}
public static void main(String args[])
{
Priority a=new Priority();
a.setPriority(MAX_PRIORITY);
a.start();
Priority a1=new Priority();
a1.setPriority(NORM_PRIORITY);
a1.start();
Priority a2=new Priority();
a2.setPriority(MIN_PRIORITY);
a2.start();
}
}
